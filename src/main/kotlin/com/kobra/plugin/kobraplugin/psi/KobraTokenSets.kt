package com.kobra.plugin.kobraplugin.psi

import com.intellij.psi.tree.TokenSet

object KobraTokenSets {
    val COMMENTS: TokenSet get() = TokenSet.create(KobraTypes.COMMENT)
}
