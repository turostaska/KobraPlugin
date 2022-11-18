// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraInfixOperation extends PsiElement {

  @NotNull
  List<KobraNl> getNlList();

  @NotNull
  List<KobraElvisExpression> getElvisExpressionList();

  @NotNull
  List<KobraInOperator> getInOperatorList();

  @NotNull
  List<KobraIsOperator> getIsOperatorList();

  @NotNull
  List<KobraType> getTypeList();

}
