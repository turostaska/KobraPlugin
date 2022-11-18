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

public class KobraComparisonOperatorImpl extends ASTWrapperPsiElement implements KobraComparisonOperator {

  public KobraComparisonOperatorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KobraVisitor visitor) {
    visitor.visitComparisonOperator(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KobraVisitor) accept((KobraVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KobraGe getGe() {
    return findChildByClass(KobraGe.class);
  }

  @Override
  @Nullable
  public KobraLangle getLangle() {
    return findChildByClass(KobraLangle.class);
  }

  @Override
  @Nullable
  public KobraLe getLe() {
    return findChildByClass(KobraLe.class);
  }

  @Override
  @Nullable
  public KobraRangle getRangle() {
    return findChildByClass(KobraRangle.class);
  }

}
