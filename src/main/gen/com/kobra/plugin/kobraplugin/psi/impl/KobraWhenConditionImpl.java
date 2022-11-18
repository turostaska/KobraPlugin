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

public class KobraWhenConditionImpl extends ASTWrapperPsiElement implements KobraWhenCondition {

  public KobraWhenConditionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KobraVisitor visitor) {
    visitor.visitWhenCondition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KobraVisitor) accept((KobraVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KobraExpression getExpression() {
    return findChildByClass(KobraExpression.class);
  }

  @Override
  @Nullable
  public KobraRangeTest getRangeTest() {
    return findChildByClass(KobraRangeTest.class);
  }

  @Override
  @Nullable
  public KobraTypeTest getTypeTest() {
    return findChildByClass(KobraTypeTest.class);
  }

}
