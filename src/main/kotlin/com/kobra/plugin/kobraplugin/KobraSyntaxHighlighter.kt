package com.kobra.plugin.kobraplugin

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.TokenIElementType

private val KEYWORDS = listOf(
    kobraLexer.VAR, kobraLexer.VAL,
    kobraLexer.FOR, kobraLexer.IF, kobraLexer.ELSE, kobraLexer.RETURN, kobraLexer.BREAK, kobraLexer.CONTINUE,
    kobraLexer.FUN,
    kobraLexer.CLASS, kobraLexer.THIS, kobraLexer.INTERFACE, kobraLexer.OVERRIDE,
    kobraLexer.IMPORT, kobraLexer.AS,
    kobraLexer.USING,
    kobraLexer.CATCH, kobraLexer.THROW, kobraLexer.FINALLY,
    kobraLexer.IS,
    kobraLexer.WHEN,
    kobraLexer.BooleanLiteral, kobraLexer.NullLiteral,
    kobraLexer.IN,
)

class KobraSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        val lexer = kobraLexer(null)
        return ANTLRLexerAdaptor(KobraLanguage, lexer)
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<out TextAttributesKey?> {
        if (tokenType !is TokenIElementType) return EMPTY_KEYS
        val attrKey: TextAttributesKey = when (tokenType.antlrTokenType) {
            kobraLexer.Identifier -> ID
            in KEYWORDS -> KEYWORD
            kobraLexer.StringLiteral -> STRING
            kobraLexer.LineComment -> LINE_COMMENT
            kobraLexer.DelimitedComment -> BLOCK_COMMENT
            else -> return EMPTY_KEYS
        }
        return arrayOf(attrKey)
    }

    companion object {
        private val EMPTY_KEYS = arrayOfNulls<TextAttributesKey>(0)
        val ID = TextAttributesKey.createTextAttributesKey("KOBRA_ID", DefaultLanguageHighlighterColors.IDENTIFIER)
        val KEYWORD =
            TextAttributesKey.createTextAttributesKey("KOBRA_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val STRING = TextAttributesKey.createTextAttributesKey("KOBRA_STRING", DefaultLanguageHighlighterColors.STRING)
        val LINE_COMMENT = TextAttributesKey.createTextAttributesKey(
            "KOBRA_LINE_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT
        )
        val BLOCK_COMMENT = TextAttributesKey.createTextAttributesKey(
            "KOBRA_BLOCK_COMMENT",
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
