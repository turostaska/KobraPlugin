// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraParenthesizedExpression extends PsiElement {

  @NotNull
  KobraLparen getLparen();

  @NotNull
  List<KobraNl> getNlList();

  @NotNull
  KobraRparen getRparen();

  @NotNull
  KobraExpression getExpression();

}
