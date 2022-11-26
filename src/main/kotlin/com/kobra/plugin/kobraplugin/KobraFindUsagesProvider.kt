package com.kobra.plugin.kobraplugin

import com.intellij.lang.cacheBuilder.WordsScanner
import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.psi.PsiElement
import com.kobra.plugin.kobraplugin.psi.FunctionSubtree
import com.kobra.plugin.kobraplugin.psi.IdentifierPSINode
import com.kobra.plugin.kobraplugin.psi.VardefSubtree
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

private fun ANTLRPsiNode?.hasAncestorOrIs(ruleIndex: Int): Boolean {
    if (this == null) return false
    val elType = node.elementType as? RuleIElementType ?: return false

    return if (elType.ruleIndex == ruleIndex) true
    else (parent as? ANTLRPsiNode)?.hasAncestorOrIs(ruleIndex) ?: return false
}

// kedd 14:30
class KobraFindUsagesProvider : FindUsagesProvider {
    /** Is "find usages" meaningful for a kind of definition subtree?  */
    override fun canFindUsagesFor(psiElement: PsiElement): Boolean {
        return psiElement is IdentifierPSINode ||  // the case where we highlight the ID in def subtree itself
                psiElement is FunctionSubtree ||  // remaining cases are for resolve() results
                psiElement is VardefSubtree
    }

    override fun getWordsScanner(): WordsScanner? = null // null implies use SimpleWordScanner default

    override fun getHelpId(psiElement: PsiElement): String? = null

    /** What kind of thing is the ID node? Can group by in "Find Usages" dialog  */
    override fun getType(element: PsiElement): String {
        val parent = element.parent as ANTLRPsiNode

        return when {
            parent.hasAncestorOrIs(kobraParser.RULE_functionDeclaration)
                    || parent.hasAncestorOrIs(kobraParser.RULE_postfixUnaryExpression) -> "function"

            parent.hasAncestorOrIs(kobraParser.RULE_propertyDeclaration) -> "variable"
            parent.hasAncestorOrIs(kobraParser.RULE_functionParameter) -> "parameter"
            parent.hasAncestorOrIs(kobraParser.RULE_statement)
                    || parent.hasAncestorOrIs(kobraParser.RULE_expression)
                    || parent.hasAncestorOrIs(kobraParser.RULE_primaryExpression) -> "variable"

            else -> ""
        }

//        var currentNode = element.parent as? ANTLRPsiNode
//        while (true) {
//            val elType = currentNode?.node?.elementType as? RuleIElementType ?: return ""
//
//            when (elType.ruleIndex) {
//                kobraParser.RULE_functionDeclaration, kobraParser.RULE_postfixUnaryExpression -> return "function"
//                kobraParser.RULE_propertyDeclaration -> return "variable"
//                kobraParser.RULE_functionParameter -> return "parameter"
//                kobraParser.RULE_statement, kobraParser.RULE_expression, kobraParser.RULE_primaryExpression -> return "variable"
//            }
//
//            currentNode = currentNode.parent as ANTLRPsiNode
//        }
    }

    override fun getDescriptiveName(element: PsiElement): String = element.text

    override fun getNodeText(element: PsiElement, useFullName: Boolean): String = element.text
}
