package com.kobra.plugin.kobraplugin.psi

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.kobra.plugin.kobraplugin.KobraLanguage
import org.antlr.intellij.adaptor.SymtabUtils
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode
import org.antlr.intellij.adaptor.psi.ScopeNode

class BlockSubtree(node: ASTNode) : ANTLRPsiNode(node), ScopeNode {
    override fun resolve(element: PsiNamedElement): PsiElement? {
        return SymtabUtils.resolve(
            this, KobraLanguage,
            element, "//block/statements/statement/declaration/propertyDeclaration/simpleIdentifier"
        )
    }
}
