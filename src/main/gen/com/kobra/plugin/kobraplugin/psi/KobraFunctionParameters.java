// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraFunctionParameters extends PsiElement {

  @NotNull
  List<KobraComma> getCommaList();

  @NotNull
  KobraLparen getLparen();

  @NotNull
  List<KobraNl> getNlList();

  @NotNull
  KobraRparen getRparen();

  @NotNull
  List<KobraFunctionParameter> getFunctionParameterList();

}
