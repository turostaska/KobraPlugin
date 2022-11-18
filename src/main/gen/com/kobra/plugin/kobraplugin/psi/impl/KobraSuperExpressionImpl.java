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

public class KobraSuperExpressionImpl extends ASTWrapperPsiElement implements KobraSuperExpression {

  public KobraSuperExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KobraVisitor visitor) {
    visitor.visitSuperExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KobraVisitor) accept((KobraVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KobraLangle getLangle() {
    return findChildByClass(KobraLangle.class);
  }

  @Override
  @NotNull
  public List<KobraNl> getNlList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KobraNl.class);
  }

  @Override
  @Nullable
  public KobraRangle getRangle() {
    return findChildByClass(KobraRangle.class);
  }

  @Override
  @NotNull
  public KobraSuper getSuper() {
    return findNotNullChildByClass(KobraSuper.class);
  }

  @Override
  @Nullable
  public KobraType getType() {
    return findChildByClass(KobraType.class);
  }

}
