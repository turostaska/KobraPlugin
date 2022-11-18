// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.kobra.plugin.kobraplugin.psi.KobraTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.kobra.plugin.kobraplugin.psi.*;

public class KobraClassDeclarationImpl extends ASTWrapperPsiElement implements KobraClassDeclaration {

  public KobraClassDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KobraVisitor visitor) {
    visitor.visitClassDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KobraVisitor) accept((KobraVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public KobraClass_ getClass_() {
    return findNotNullChildByClass(KobraClass_.class);
  }

  @Override
  @Nullable
  public KobraColon getColon() {
    return findChildByClass(KobraColon.class);
  }

  @Override
  @NotNull
  public List<KobraNl> getNlList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KobraNl.class);
  }

  @Override
  @Nullable
  public KobraClassBody getClassBody() {
    return findChildByClass(KobraClassBody.class);
  }

  @Override
  @Nullable
  public KobraDelegationSpecifiers getDelegationSpecifiers() {
    return findChildByClass(KobraDelegationSpecifiers.class);
  }

  @Override
  @Nullable
  public KobraPrimaryConstructor getPrimaryConstructor() {
    return findChildByClass(KobraPrimaryConstructor.class);
  }

  @Override
  @NotNull
  public KobraSimpleIdentifier getSimpleIdentifier() {
    return findNotNullChildByClass(KobraSimpleIdentifier.class);
  }

}
