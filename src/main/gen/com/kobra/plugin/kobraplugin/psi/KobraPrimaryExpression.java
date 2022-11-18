// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraPrimaryExpression extends PsiElement {

  @Nullable
  KobraCollectionLiteral getCollectionLiteral();

  @Nullable
  KobraIfExpression getIfExpression();

  @Nullable
  KobraJumpExpression getJumpExpression();

  @Nullable
  KobraLiteralConstant getLiteralConstant();

  @Nullable
  KobraParenthesizedExpression getParenthesizedExpression();

  @Nullable
  KobraSimpleIdentifier getSimpleIdentifier();

  @Nullable
  KobraStringLiteral getStringLiteral();

  @Nullable
  KobraSuperExpression getSuperExpression();

  @Nullable
  KobraThisExpression getThisExpression();

  @Nullable
  KobraTryExpression getTryExpression();

  @Nullable
  KobraWhenExpression getWhenExpression();

}
