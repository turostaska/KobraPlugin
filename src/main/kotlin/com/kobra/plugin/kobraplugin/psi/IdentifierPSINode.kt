package com.kobra.plugin.kobraplugin.psi

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.PsiReference
import com.intellij.psi.tree.IElementType
import com.intellij.util.IncorrectOperationException
import com.kobra.plugin.kobraplugin.KobraLanguage
import com.kobra.plugin.kobraplugin.KobraParserDefinition
import com.kobra.plugin.kobraplugin.kobraParser
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.psi.ANTLRPsiLeafNode
import org.antlr.intellij.adaptor.psi.Trees
import org.jetbrains.annotations.NonNls

private fun PsiElement?.hasAncestorOrIs(ruleIndex: Int): Boolean {
    if (this == null) return false
    val elType = node.elementType as? RuleIElementType ?: return false

    return if (elType.ruleIndex == ruleIndex) true
    else parent?.hasAncestorOrIs(ruleIndex) ?: return false
}

class IdentifierPSINode(
    type: IElementType?,
    text: CharSequence?
) : ANTLRPsiLeafNode(type, text), PsiNamedElement {
    override fun getName(): String = text

    /** Alter this node to have text specified by the argument. Do this by
     * creating a new node through parsing of an ID and then doing a
     * replace.
     */
    @Throws(IncorrectOperationException::class)
    override fun setName(@NonNls name: String): PsiElement {
        if (parent == null) return this

        val newID = Trees.createLeafFromText(
            project,
            KobraLanguage,
            context,
            name,
            KobraParserDefinition.ID
        )
        return if (newID != null) {
            this.replace(newID) // use replace on leaves but replaceChild on ID nodes that are part of defs/decls.
        } else this
    }

    /** Create and return a PsiReference object associated with this ID
     * node. The reference object will be asked to resolve this ref
     * by using the text of this node to identify the appropriate definition
     * site. The definition site is typically a subtree for a function
     * or variable definition whereas this reference is just to this ID
     * leaf node.
     *
     * As the AST factory has no context and cannot create different kinds
     * of PsiNamedElement nodes according to context, every ID node
     * in the tree will be of this type. So, we distinguish references
     * from definitions or other uses by looking at context in this method
     * as we have parent (context) information.
     */
    override fun getReference(): PsiReference? {
        return when {
            parent.hasAncestorOrIs(kobraParser.RULE_statement)
                    || parent.hasAncestorOrIs(kobraParser.RULE_expression)
                    || parent.hasAncestorOrIs(kobraParser.RULE_primaryExpression)-> VariableRef(this)

            parent.hasAncestorOrIs(kobraParser.RULE_postfixUnaryExpression)
                    || parent.hasAncestorOrIs(kobraParser.RULE_functionDeclaration) -> FunctionRef(this)

            else -> null
        }

//        var currentNode = parent
//        while (true) {
//            val elType = currentNode?.parent?.node?.elementType ?: return null
//
//            if (elType is RuleIElementType) {
//                when (elType.ruleIndex) {
//                    kobraParser.RULE_statement, kobraParser.RULE_expression, kobraParser.RULE_primaryExpression
//                        -> return VariableRef(this)
//                    kobraParser.RULE_postfixUnaryExpression, kobraParser.RULE_functionDeclaration -> return FunctionRef(this)
//                }
//            }
//
//            currentNode = currentNode.parent
//        }
    }
}
