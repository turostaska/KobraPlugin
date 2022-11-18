// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraFunctionDeclaration extends PsiElement {

  @Nullable
  KobraColon getColon();

  @NotNull
  KobraFun getFun();

  @NotNull
  List<KobraNl> getNlList();

  @NotNull
  KobraFunctionBody getFunctionBody();

  @NotNull
  KobraFunctionParameters getFunctionParameters();

  @NotNull
  KobraSimpleIdentifier getSimpleIdentifier();

  @Nullable
  KobraType getType();

}
