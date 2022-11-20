package com.kobra.plugin.kobraplugin.psi

import com.intellij.psi.PsiElement

class VariableRef(element: IdentifierPSINode) : KobraElementRef(element) {
    override fun isDefSubtree(def: PsiElement?): Boolean {
        return def is VardefSubtree
    }
}
