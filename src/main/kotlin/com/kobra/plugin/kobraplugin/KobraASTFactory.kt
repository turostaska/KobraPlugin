package com.kobra.plugin.kobraplugin

import com.intellij.lang.DefaultASTFactoryImpl
import com.intellij.psi.impl.source.tree.LeafElement
import com.intellij.psi.tree.IElementType
import com.kobra.plugin.kobraplugin.psi.IdentifierPSINode
import org.antlr.intellij.adaptor.lexer.TokenIElementType

class KobraASTFactory : DefaultASTFactoryImpl() {

    /** Create a parse tree (AST) leaf node from a token. Doubles as a PSI leaf node.
     * Does not see whitespace tokens.  Default impl makes [LeafPsiElement]
     * or [PsiCoreCommentImpl] depending on [ParserDefinition.getCommentTokens].
     */
    override fun createLeaf(
        type: IElementType,
        text: CharSequence
    ): LeafElement {
        return if (type is TokenIElementType && type.antlrTokenType == kobraLexer.Identifier) {
            IdentifierPSINode(type, text)
        } else super.createLeaf(type, text)
    }
}
