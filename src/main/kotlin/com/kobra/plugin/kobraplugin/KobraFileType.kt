package com.kobra.plugin.kobraplugin

import com.intellij.openapi.fileTypes.LanguageFileType

object KobraFileType : LanguageFileType(KobraLanguage) {
    override fun getName() = "Kobra File"
    override fun getDescription() = "Kobra language file"
    override fun getDefaultExtension() = "kb"
    override fun getIcon() = KobraIcons.FILE
}
