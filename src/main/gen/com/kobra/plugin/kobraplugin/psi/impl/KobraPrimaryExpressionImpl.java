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

public class KobraPrimaryExpressionImpl extends ASTWrapperPsiElement implements KobraPrimaryExpression {

  public KobraPrimaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KobraVisitor visitor) {
    visitor.visitPrimaryExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KobraVisitor) accept((KobraVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KobraCollectionLiteral getCollectionLiteral() {
    return findChildByClass(KobraCollectionLiteral.class);
  }

  @Override
  @Nullable
  public KobraIfExpression getIfExpression() {
    return findChildByClass(KobraIfExpression.class);
  }

  @Override
  @Nullable
  public KobraJumpExpression getJumpExpression() {
    return findChildByClass(KobraJumpExpression.class);
  }

  @Override
  @Nullable
  public KobraLiteralConstant getLiteralConstant() {
    return findChildByClass(KobraLiteralConstant.class);
  }

  @Override
  @Nullable
  public KobraParenthesizedExpression getParenthesizedExpression() {
    return findChildByClass(KobraParenthesizedExpression.class);
  }

  @Override
  @Nullable
  public KobraSimpleIdentifier getSimpleIdentifier() {
    return findChildByClass(KobraSimpleIdentifier.class);
  }

  @Override
  @Nullable
  public KobraStringLiteral getStringLiteral() {
    return findChildByClass(KobraStringLiteral.class);
  }

  @Override
  @Nullable
  public KobraSuperExpression getSuperExpression() {
    return findChildByClass(KobraSuperExpression.class);
  }

  @Override
  @Nullable
  public KobraThisExpression getThisExpression() {
    return findChildByClass(KobraThisExpression.class);
  }

  @Override
  @Nullable
  public KobraTryExpression getTryExpression() {
    return findChildByClass(KobraTryExpression.class);
  }

  @Override
  @Nullable
  public KobraWhenExpression getWhenExpression() {
    return findChildByClass(KobraWhenExpression.class);
  }

}
