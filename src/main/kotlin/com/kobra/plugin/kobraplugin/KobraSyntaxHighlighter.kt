package com.kobra.plugin.kobraplugin

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.TokenIElementType

class KobraSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        val lexer = kobraLexer(null)
        return ANTLRLexerAdaptor(KobraLanguage, lexer)
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<out TextAttributesKey?> {
        if (tokenType !is TokenIElementType) return EMPTY_KEYS
        val attrKey: TextAttributesKey = when (tokenType.antlrTokenType) {
            kobraLexer.Identifier -> ID
            kobraLexer.VAR, kobraLexer.VAL, kobraLexer.FOR, kobraLexer.IF, kobraLexer.ELSE, kobraLexer.RETURN, kobraLexer.FUN, kobraLexer.BooleanLiteral -> KEYWORD
            kobraLexer.STRING -> STRING
            kobraLexer.LineComment -> LINE_COMMENT
            kobraLexer.DelimitedComment -> BLOCK_COMMENT
            else -> return EMPTY_KEYS
        }
        return arrayOf(attrKey)
    }

    companion object {
        private val EMPTY_KEYS = arrayOfNulls<TextAttributesKey>(0)
        val ID = TextAttributesKey.createTextAttributesKey("SAMPLE_ID", DefaultLanguageHighlighterColors.IDENTIFIER)
        val KEYWORD =
            TextAttributesKey.createTextAttributesKey("SAMPLE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val STRING = TextAttributesKey.createTextAttributesKey("SAMPLE_STRING", DefaultLanguageHighlighterColors.STRING)
        val LINE_COMMENT = TextAttributesKey.createTextAttributesKey(
            "SAMPLE_LINE_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT
        )
        val BLOCK_COMMENT = TextAttributesKey.createTextAttributesKey(
            "SAMPLE_BLOCK_COMMENT",
            DefaultLanguageHighlighterColors.BLOCK_COMMENT
        )

        init {
            PSIElementTypeFactory.defineLanguageIElementTypes(
                KobraLanguage,
                kobraParser.tokenNames,
                kobraParser.ruleNames
            )
        }
    }
}
