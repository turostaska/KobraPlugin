package com.kobra.plugin.kobraplugin

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import com.kobra.plugin.kobraplugin.psi.*
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.lexer.TokenIElementType
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode
import org.antlr.v4.runtime.Parser
import org.antlr.v4.runtime.tree.ParseTree

val COMMENTS: TokenSet = PSIElementTypeFactory.createTokenSet(
    KobraLanguage,
    kobraLexer.LineComment,
    kobraLexer.DelimitedComment
)

val WHITESPACE: TokenSet = PSIElementTypeFactory.createTokenSet(
    KobraLanguage,
    kobraLexer.WS
)

val STRING: TokenSet = PSIElementTypeFactory.createTokenSet(
    KobraLanguage,
    kobraLexer.STRING
)

private fun PsiElement?.hasAncestorOrIs(ruleIndex: Int): Boolean {
    if (this == null) return false
    val elType = node.elementType as? RuleIElementType ?: return false

    return if (elType.ruleIndex == ruleIndex) true
    else (parent as? IdentifierPSINode)?.hasAncestorOrIs(ruleIndex) ?: return false
}

class KobraParserDefinition: ParserDefinition {
    private val FILE = IFileElementType(KobraLanguage)

    companion object {
        val ID: TokenIElementType? =
            PSIElementTypeFactory.getTokenIElementTypes(KobraLanguage)?.get(kobraLexer.Identifier)
    }

    init {
        PSIElementTypeFactory.defineLanguageIElementTypes(KobraLanguage, kobraParser.tokenNames, kobraParser.ruleNames)
    }

    override fun createLexer(project: Project?): Lexer {
        val lexer = kobraLexer(null)
        return ANTLRLexerAdaptor(KobraLanguage, lexer)
    }

    override fun createParser(project: Project?): PsiParser {
        val parser = kobraParser(null)
        return object : ANTLRParserAdaptor(KobraLanguage, parser) {
            override fun parse(parser: Parser, root: IElementType): ParseTree {
                // start rule depends on root passed in; sometimes we want to create an ID node etc...
                return if (root is IFileElementType) {
                    (parser as kobraParser).program()
                } else (parser as kobraParser).primaryExpression()
                // let's hope it's an ID as needed by "rename function"
            }
        }
    }

    override fun getWhitespaceTokens(): TokenSet = WHITESPACE
    override fun getCommentTokens(): TokenSet = COMMENTS
    override fun getStringLiteralElements(): TokenSet = STRING

    override fun spaceExistanceTypeBetweenTokens(left: ASTNode?, right: ASTNode?) =
        ParserDefinition.SpaceRequirements.MAY

    override fun getFileNodeType() = FILE

    override fun createElement(node: ASTNode): PsiElement {
        val elType = node.elementType
        if (elType is TokenIElementType) {
            return ANTLRPsiNode(node)
        }
        if (elType !is RuleIElementType) {
            return ANTLRPsiNode(node)
        }
        return when (elType.ruleIndex) {
            kobraParser.RULE_functionDeclaration -> FunctionSubtree(node, elType)
            kobraParser.RULE_propertyDeclaration -> VardefSubtree(node, elType)
            kobraParser.RULE_functionParameter -> ArgdefSubtree(node, elType)
            kobraParser.RULE_block -> BlockSubtree(node)
            kobraParser.RULE_classBody -> ClassBlockSubtree(node)
            kobraParser.RULE_postfixUnaryExpression -> CallSubtree(node)
            else -> ANTLRPsiNode(node)
        }
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile = KobraPSIFileRoot(viewProvider)

}