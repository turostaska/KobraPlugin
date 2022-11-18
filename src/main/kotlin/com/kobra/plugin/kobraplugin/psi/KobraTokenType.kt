package com.kobra.plugin.kobraplugin.psi

import com.intellij.psi.tree.IElementType
import com.kobra.plugin.kobraplugin.KobraLanguage

class KobraTokenType(debugName: String) : IElementType(debugName, KobraLanguage) {
    override fun toString(): String = "KobraTokenType.${super.toString()}"
}
