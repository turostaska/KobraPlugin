package com.kobra.plugin.kobraplugin.psi

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.PsiReferenceBase
import com.intellij.util.IncorrectOperationException
import org.antlr.intellij.adaptor.psi.ScopeNode

abstract class KobraElementRef(
    element: IdentifierPSINode
) : PsiReferenceBase<IdentifierPSINode?>(element, TextRange(0, element.text.length)) {
    override fun getVariants(): Array<Any?> {
        return arrayOfNulls(0)
    }

    /** Change the REFERENCE's ID node (not the targeted def's ID node)
     * to reflect a rename.
     *
     * Without this method, we get an error ("Cannot find manipulator...").
     *
     * getElement() refers to the identifier node that references the definition.
     */
    @Throws(IncorrectOperationException::class)
    override fun handleElementRename(newElementName: String): PsiElement {
//		System.out.println(getClass().getSimpleName()+".handleElementRename("+myElement.getName()+"->"+newElementName+
//			                   ") on "+myElement+" at "+Integer.toHexString(myElement.hashCode()));
        return myElement!!.setName(newElementName)
    }

    /** Resolve a reference to the definition subtree (subclass of
     * IdentifierDefSubtree), do not resolve to the ID child of that
     * definition subtree root.
     */
    override fun resolve(): PsiElement? {
//		System.out.println(getClass().getSimpleName()+
//		                   ".resolve("+myElement.getName()+
//		                   " at "+Integer.toHexString(myElement.hashCode())+")");
        val scope = myElement!!.context as ScopeNode? ?: return null
        return scope.resolve(myElement)
    }

    override fun isReferenceTo(def: PsiElement): Boolean {
        var def = def
        val refName = myElement!!.name
        //		System.out.println(getClass().getSimpleName()+".isReferenceTo("+refName+"->"+def.getText()+")");
        // sometimes def comes in pointing to ID node itself. depends on what you click on
        if (def is IdentifierPSINode && isDefSubtree(def.getParent())) {
            def = def.getParent()
        }
        if (isDefSubtree(def)) {
            val id = (def as PsiNameIdentifierOwner).nameIdentifier
            val defName = id?.text
            return defName != null && refName == defName
        }
        return false
    }

    /** Is the targeted def a subtree associated with this ref's kind of node?
     * E.g., for a variable def, this should return true for VardefSubtree.
     */
    abstract fun isDefSubtree(def: PsiElement?): Boolean
}