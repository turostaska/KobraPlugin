package com.kobra.plugin.kobraplugin.psi

import com.intellij.psi.PsiElement

class FunctionRef(element: IdentifierPSINode) : KobraElementRef(element) {
    override fun isDefSubtree(def: PsiElement?): Boolean {
        return def is FunctionSubtree
    }
}
