package com.kobra.plugin.kobraplugin.structview

import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiFile

class KobraStructureViewRootElement(element: PsiFile) :
    KobraStructureViewElement(element) {
    override fun getPresentation(): ItemPresentation {
        return KobraRootPresentation(element as PsiFile)
    }
}
