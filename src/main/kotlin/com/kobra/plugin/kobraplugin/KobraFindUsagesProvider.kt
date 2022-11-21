package com.kobra.plugin.kobraplugin

import com.intellij.lang.cacheBuilder.WordsScanner
import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.psi.PsiElement
import com.kobra.plugin.kobraplugin.psi.FunctionSubtree
import com.kobra.plugin.kobraplugin.psi.IdentifierPSINode
import com.kobra.plugin.kobraplugin.psi.VardefSubtree
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

class KobraFindUsagesProvider : FindUsagesProvider {
    /** Is "find usages" meaningful for a kind of definition subtree?  */
    override fun canFindUsagesFor(psiElement: PsiElement): Boolean {
        return psiElement is IdentifierPSINode ||  // the case where we highlight the ID in def subtree itself
                psiElement is FunctionSubtree ||  // remaining cases are for resolve() results
                psiElement is VardefSubtree
    }

    override fun getWordsScanner(): WordsScanner? {
        return null // null implies use SimpleWordScanner default
    }

    override fun getHelpId(psiElement: PsiElement): String? = null

    /** What kind of thing is the ID node? Can group by in "Find Usages" dialog  */
    override fun getType(element: PsiElement): String {
        val parent = element.parent as ANTLRPsiNode
        val elType = parent.node.elementType as RuleIElementType
        when (elType.ruleIndex) {
            kobraParser.RULE_functionDeclaration, kobraParser.RULE_parenthesizedExpression -> return "function"
            kobraParser.RULE_propertyDeclaration -> return "variable"
            kobraParser.RULE_functionParameter -> return "parameter"
            kobraParser.RULE_statement, kobraParser.RULE_expression, kobraParser.RULE_primaryExpression -> return "variable"
        }
        return ""
    }

    override fun getDescriptiveName(element: PsiElement): String = element.text

    override fun getNodeText(element: PsiElement, useFullName: Boolean): String = element.text
}
