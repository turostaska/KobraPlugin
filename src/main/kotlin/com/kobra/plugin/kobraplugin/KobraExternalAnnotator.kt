package com.kobra.plugin.kobraplugin

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.ExternalAnnotator
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.util.elementType
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.psi.Trees
import org.antlr.intellij.adaptor.xpath.XPath

class KobraExternalAnnotator :
    ExternalAnnotator<PsiFile?, List<KobraExternalAnnotator.Issue>?>() {
    // NOTE: can't use instance vars as only 1 instance
    class Issue(val msg: String, val offendingNode: PsiElement?)

    /** Called first; in our case, just return file and do nothing  */
    override fun collectInformation(file: PsiFile): PsiFile = file

    /** Called 2nd; look for trouble in file and return list of issues.
     *
     * For most custom languages, you would not reimplement your semantic
     * analyzer using PSI trees. Instead, here is where you would call out to
     * your custom languages compiler or interpreter to get error messages
     * or other bits of information you'd like to annotate the document with.
     */
    override fun doAnnotate(file: PsiFile?): List<Issue> {
        val funcNameNodes = XPath.findAll(KobraLanguage, file, "/program/statements/statement/declaration/functionDeclaration/simpleIdentifier/Identifier")
        val funcCallNameNodes = XPath.findAll(KobraLanguage, file, "//postfixUnaryExpression/primaryExpression/simpleIdentifier/Identifier")
            .filter { (it?.parent?.parent?.nextSibling?.elementType as? RuleIElementType)?.ruleIndex == kobraParser.RULE_postfixUnarySuffix }
        val funcNames = Trees.toMap(funcNameNodes)
        val funcCalls = Trees.toMap(funcCallNameNodes)
        val issues: MutableList<Issue> = ArrayList()
        for (name in funcCalls.keys) {
            if (!funcNames.containsKey(name)) {
                val issue = Issue("Unknown function: $name", funcCalls[name])
                issues.add(issue)
            }
        }
        return issues
    }

    /** Called 3rd to actually annotate the editor window  */
    override fun apply(
        file: PsiFile,
        issues: List<Issue>?,
        holder: AnnotationHolder
    ) {
        for (issue in issues!!) {
            val range = issue.offendingNode!!.textRange
            holder.createErrorAnnotation(range, issue.msg)
        }
    }
}