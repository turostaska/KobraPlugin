package com.kobra.plugin.kobraplugin

import com.intellij.navigation.ChooseByNameContributor
import com.intellij.navigation.NavigationItem
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiManager
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.util.PsiTreeUtil
import com.kobra.plugin.kobraplugin.psi.KobraFile
import com.kobra.plugin.kobraplugin.psi.VardefSubtree


fun findProperties(project: Project, key: String): List<PsiNameIdentifierOwner> {
    val result: MutableList<PsiNameIdentifierOwner> = ArrayList()
    val virtualFiles: Collection<VirtualFile> =
        FileTypeIndex.getFiles(KobraFileType, GlobalSearchScope.allScope(project))
    for (virtualFile in virtualFiles) {
        val file = PsiManager.getInstance(project).findFile(virtualFile) as KobraFile
        val properties = PsiTreeUtil.getChildrenOfType(file, VardefSubtree::class.java)
        if (properties != null) {
            for (property in properties) {
                if (key == property.name) {
                    result.add(property)
                }
            }
        }
    }
    return result
}

fun findProperties(project: Project): List<PsiNameIdentifierOwner> {
    val result: MutableList<PsiNameIdentifierOwner> = ArrayList()
    val virtualFiles = FileTypeIndex.getFiles(
        KobraFileType, GlobalSearchScope.allScope(project)
    ).filterNotNull()
    for (virtualFile in virtualFiles) {
        val simpleFile = PsiManager.getInstance(project).findFile(virtualFile)
        val properties = PsiTreeUtil.getChildrenOfType(
            simpleFile,
            VardefSubtree::class.java
        )
        if (properties != null) {
            result += properties
        }
    }
    return result
}

class KobraChooseByNameContributor : ChooseByNameContributor {
    override fun getNames(project: Project, includeNonProjectItems: Boolean): Array<String> {
        val properties = findProperties(project)
        val names: MutableList<String> = ArrayList(properties.size)
        for (property in properties) {
            if (property.name!!.isNotEmpty()) {
                names.add(property.name!!)
            }
        }
        return names.toTypedArray()
    }

    override fun getItemsByName(
        name: String,
        pattern: String,
        project: Project,
        includeNonProjectItems: Boolean
    ): Array<NavigationItem?> {
        val properties = findProperties(project, name)
        return properties?.filter { it.text == name }?.map { it as NavigationItem? }?.toTypedArray() ?: emptyArray()
    }
}
