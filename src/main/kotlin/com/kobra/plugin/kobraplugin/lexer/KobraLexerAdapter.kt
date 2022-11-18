package com.kobra.plugin.kobraplugin.lexer

import com.intellij.lexer.FlexAdapter
import com.kobra.plugin.kobraplugin.KobraLexer

class KobraLexerAdapter : FlexAdapter(KobraLexer(null))
