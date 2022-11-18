// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraAdditiveExpression extends PsiElement {

  @NotNull
  List<KobraNl> getNlList();

  @NotNull
  List<KobraAdditiveOperator> getAdditiveOperatorList();

  @NotNull
  List<KobraMultiplicativeExpression> getMultiplicativeExpressionList();

}
