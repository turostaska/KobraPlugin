package com.kobra.plugin.kobraplugin.psi

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.tree.IElementType
import com.kobra.plugin.kobraplugin.KobraLanguage
import org.antlr.intellij.adaptor.SymtabUtils
import org.antlr.intellij.adaptor.psi.IdentifierDefSubtree
import org.antlr.intellij.adaptor.psi.ScopeNode

class FunctionSubtree(
    node: ASTNode,
    idElementType: IElementType
) : IdentifierDefSubtree(node, idElementType), ScopeNode {
    override fun resolve(element: PsiNamedElement): PsiElement? {
        return SymtabUtils.resolve(
            this, KobraLanguage,
            element, "/program/statements/statement/declaration/functionDeclaration/simpleIdentifier"
        )
    }
}
