package com.kobra.plugin.kobraplugin

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import com.kobra.plugin.kobraplugin.lexer.KobraLexerAdapter
import com.kobra.plugin.kobraplugin.psi.KobraFile
import com.kobra.plugin.kobraplugin.psi.KobraTokenSets
import com.kobra.plugin.kobraplugin.psi.KobraTypes
import com.kobra.plugin.parser.KobraParser

class KobraParserDefinition: ParserDefinition {
    private val FILE = IFileElementType(KobraLanguage)

    override fun createLexer(project: Project?) = KobraLexerAdapter()

    override fun createParser(project: Project?) = KobraParser()

    override fun getFileNodeType() = FILE

    override fun getCommentTokens() = KobraTokenSets.COMMENTS

    override fun getStringLiteralElements(): TokenSet {
        // todo
        return TokenSet.EMPTY
    }

    override fun createElement(node: ASTNode?): PsiElement = KobraTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider) = KobraFile(viewProvider)
}