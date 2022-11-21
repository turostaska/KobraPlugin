package com.kobra.plugin.kobraplugin.structview

import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiFile
import com.kobra.plugin.kobraplugin.KobraIcons
import javax.swing.Icon

open class KobraRootPresentation(protected val element: PsiFile) : ItemPresentation {
    override fun getIcon(unused: Boolean): Icon = KobraIcons.FILE

    override fun getPresentableText(): String {
        return element.virtualFile.nameWithoutExtension
    }

    override fun getLocationString(): String? {
        return null
    }
}
