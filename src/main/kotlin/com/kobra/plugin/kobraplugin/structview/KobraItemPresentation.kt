package com.kobra.plugin.kobraplugin.structview

import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.kobra.plugin.kobraplugin.KobraIcons
import javax.swing.Icon

open class KobraItemPresentation(
    protected val element: PsiElement
) : ItemPresentation {
    override fun getIcon(unused: Boolean): Icon {
        return KobraIcons.F_ICON
    }

    override fun getPresentableText(): String? {
        val node = element.node
        return node.text
    }

    override fun getLocationString(): String? {
        return null
    }
}
