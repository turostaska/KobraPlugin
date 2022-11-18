package com.kobra.plugin.kobraplugin.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider
import com.kobra.plugin.kobraplugin.KobraFileType
import com.kobra.plugin.kobraplugin.KobraLanguage

class KobraFile(
    viewProvider: FileViewProvider,
): PsiFileBase(viewProvider, KobraLanguage) {
    override fun getFileType() = KobraFileType

    override fun toString() = "Kobra File"
}
