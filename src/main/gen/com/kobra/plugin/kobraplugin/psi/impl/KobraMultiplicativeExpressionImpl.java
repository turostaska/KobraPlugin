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

public class KobraMultiplicativeExpressionImpl extends ASTWrapperPsiElement implements KobraMultiplicativeExpression {

  public KobraMultiplicativeExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KobraVisitor visitor) {
    visitor.visitMultiplicativeExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KobraVisitor) accept((KobraVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<KobraNl> getNlList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KobraNl.class);
  }

  @Override
  @NotNull
  public List<KobraAsExpression> getAsExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KobraAsExpression.class);
  }

  @Override
  @NotNull
  public List<KobraMultiplicativeOperator> getMultiplicativeOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KobraMultiplicativeOperator.class);
  }

}
