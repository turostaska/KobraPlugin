package com.kobra.plugin.kobraplugin

import com.intellij.lang.ASTNode
import com.intellij.lang.folding.CustomFoldingBuilder
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.editor.Document
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiRecursiveElementVisitor
import com.kobra.plugin.kobraplugin.psi.BlockSubtree


class KobraFoldingBuilder : CustomFoldingBuilder() {
    override fun isRegionCollapsedByDefault(node: ASTNode) = false

    override fun buildLanguageFoldRegions(descriptors: MutableList<FoldingDescriptor>,
                                          root: PsiElement, document: Document, quick: Boolean) {
        root.accept(object : PsiRecursiveElementVisitor() {
            override fun visitElement(element: PsiElement) {
                if (element is BlockSubtree) {
                    descriptors.add(FoldingDescriptor(element, element.textRange))
                }
                super.visitElement(element)
            }
        })
    }

    override fun getLanguagePlaceholderText(node: ASTNode, range: TextRange) = "..."
}
