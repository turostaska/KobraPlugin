// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraCollectionLiteral extends PsiElement {

  @NotNull
  List<KobraComma> getCommaList();

  @NotNull
  KobraLsquare getLsquare();

  @NotNull
  List<KobraNl> getNlList();

  @NotNull
  KobraRsquare getRsquare();

  @NotNull
  List<KobraExpression> getExpressionList();

}
