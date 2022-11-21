package com.kobra.plugin.kobraplugin.structview

import com.intellij.ide.structureView.StructureViewModel.ElementInfoProvider
import com.intellij.ide.structureView.StructureViewModelBase
import com.intellij.ide.structureView.StructureViewTreeElement
import com.intellij.ide.util.treeView.smartTree.Sorter
import com.kobra.plugin.kobraplugin.psi.KobraPSIFileRoot

class KobraStructureViewModel(root: KobraPSIFileRoot) :
    StructureViewModelBase(root, KobraStructureViewRootElement(root)), ElementInfoProvider {
    override fun getSorters(): Array<Sorter> {
        return arrayOf(Sorter.ALPHA_SORTER)
    }

    override fun isAlwaysLeaf(element: StructureViewTreeElement): Boolean {
        return !isAlwaysShowsPlus(element)
    }

    override fun isAlwaysShowsPlus(element: StructureViewTreeElement): Boolean {
        val value = element.value
        return value is KobraPSIFileRoot
    }
}
