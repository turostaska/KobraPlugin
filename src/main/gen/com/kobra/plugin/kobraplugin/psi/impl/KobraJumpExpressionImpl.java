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

public class KobraJumpExpressionImpl extends ASTWrapperPsiElement implements KobraJumpExpression {

  public KobraJumpExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KobraVisitor visitor) {
    visitor.visitJumpExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KobraVisitor) accept((KobraVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KobraBreak getBreak() {
    return findChildByClass(KobraBreak.class);
  }

  @Override
  @Nullable
  public KobraContinue getContinue() {
    return findChildByClass(KobraContinue.class);
  }

  @Override
  @NotNull
  public List<KobraNl> getNlList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KobraNl.class);
  }

  @Override
  @Nullable
  public KobraReturn getReturn() {
    return findChildByClass(KobraReturn.class);
  }

  @Override
  @Nullable
  public KobraThrow getThrow() {
    return findChildByClass(KobraThrow.class);
  }

  @Override
  @Nullable
  public KobraExpression getExpression() {
    return findChildByClass(KobraExpression.class);
  }

}
