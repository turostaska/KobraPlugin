package com.kobra.plugin.kobraplugin.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.kobra.plugin.kobraplugin.KobraFileType
import com.kobra.plugin.kobraplugin.KobraIcons
import com.kobra.plugin.kobraplugin.KobraLanguage
import org.antlr.intellij.adaptor.SymtabUtils
import org.antlr.intellij.adaptor.psi.ScopeNode
import javax.swing.Icon

private fun PsiElement.isCallSubtree(): Boolean {
    return if (this is CallSubtree) true else parent?.isCallSubtree() ?: false
}

class KobraPSIFileRoot(
    viewProvider: FileViewProvider
) : PsiFileBase(viewProvider, KobraLanguage), ScopeNode {
    override fun getFileType(): FileType = KobraFileType

    override fun toString(): String = "Kobra Language file"

    override fun getIcon(flags: Int): Icon = KobraIcons.FILE

    /** Return null since a file scope has no enclosing scope. It is
     * not itself in a scope.
     */
    override fun getContext(): ScopeNode? {
        return null
    }

    override fun resolve(element: PsiNamedElement): PsiElement? {
        return if (element.isCallSubtree()) {
            SymtabUtils.resolve(
                this, KobraLanguage, element,
                "//functionDeclaration/simpleIdentifier/Identifier"
            )
        } else SymtabUtils.resolve(
            this, KobraLanguage, element,
            "//propertyDeclaration/simpleIdentifier/Identifier"
        )
    }
}
