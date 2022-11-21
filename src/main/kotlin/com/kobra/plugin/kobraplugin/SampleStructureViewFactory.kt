package com.kobra.plugin.kobraplugin

import com.intellij.ide.structureView.StructureViewBuilder
import com.intellij.ide.structureView.StructureViewModel
import com.intellij.ide.structureView.TreeBasedStructureViewBuilder
import com.intellij.lang.PsiStructureViewFactory
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiFile
import com.kobra.plugin.kobraplugin.psi.KobraPSIFileRoot
import com.kobra.plugin.kobraplugin.structview.KobraStructureViewModel

class SampleStructureViewFactory : PsiStructureViewFactory {
    override fun getStructureViewBuilder(psiFile: PsiFile): StructureViewBuilder? {
        return object : TreeBasedStructureViewBuilder() {
            override fun createStructureViewModel(editor: Editor?): StructureViewModel {
                return KobraStructureViewModel(psiFile as KobraPSIFileRoot)
            }
        }
    }
}