package com.kobra.plugin.kobraplugin

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

class KobraColorSettingsPage : ColorSettingsPage {
    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? = null

    override fun getIcon(): Icon = KobraIcons.FILE

    override fun getHighlighter(): SyntaxHighlighter = KobraSyntaxHighlighter()

    override fun getDemoText(): String {
        return """
            |/* block comment */
            |fun f(a: String) {
            |   // line comment
            |   val i = 1
            |   for (i in 0..10) {
            |       print(i)
            |   }
            |   g("hi mom")
            |}
            |fun g(c: Int) { }
        """.trimMargin()
    }

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> = DESCRIPTORS

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName(): String = "Kobra"

    companion object {
        private val DESCRIPTORS = arrayOf(
            AttributesDescriptor("Identifier", KobraSyntaxHighlighter.ID),
            AttributesDescriptor("Keyword", KobraSyntaxHighlighter.KEYWORD),
            AttributesDescriptor("String", KobraSyntaxHighlighter.STRING),
            AttributesDescriptor("Line comment", KobraSyntaxHighlighter.LINE_COMMENT),
            AttributesDescriptor("Block comment", KobraSyntaxHighlighter.BLOCK_COMMENT)
        )
    }
}