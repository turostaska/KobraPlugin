package com.kobra.plugin.kobraplugin.structview

import com.intellij.ide.structureView.StructureViewTreeElement
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement
import com.intellij.ide.util.treeView.smartTree.TreeElement
import com.intellij.navigation.ItemPresentation
import com.intellij.navigation.NavigationItem
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.kobra.plugin.kobraplugin.KobraLanguage
import com.kobra.plugin.kobraplugin.psi.KobraPSIFileRoot
import org.antlr.intellij.adaptor.xpath.XPath


open class KobraStructureViewElement(protected val element: PsiElement) : StructureViewTreeElement,
    SortableTreeElement {
    override fun getValue(): Any = element

    override fun navigate(requestFocus: Boolean) {
        if (element is NavigationItem) {
            (element as NavigationItem).navigate(requestFocus)
        }
    }

    override fun canNavigate(): Boolean {
        return element is NavigationItem &&
                (element as NavigationItem).canNavigate()
    }

    override fun canNavigateToSource(): Boolean {
        return element is NavigationItem &&
                (element as NavigationItem).canNavigateToSource()
    }

    override fun getAlphaSortKey(): String {
        return (if (element is PsiNamedElement) element.name else null)
            ?: return "unknown key"
    }

    override fun getPresentation(): ItemPresentation {
        return KobraItemPresentation(element)
    }

    override fun getChildren(): Array<out TreeElement?> {
        if (element is KobraPSIFileRoot) {
            val funcs = XPath.findAll(
                KobraLanguage,
                element, "/program/statements/statement/declaration/functionDeclaration/simpleIdentifier/Identifier"
            )
            val treeElements: MutableList<TreeElement> = ArrayList(funcs.size)
            for (el in funcs) {
                treeElements.add(KobraStructureViewElement(el))
            }
            return treeElements.toTypedArray()
        }
        return arrayOfNulls(0)
    }
}