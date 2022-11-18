// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraIfExpression extends PsiElement {

  @Nullable
  KobraElse getElse();

  @NotNull
  KobraIf getIf();

  @NotNull
  KobraLparen getLparen();

  @NotNull
  List<KobraNl> getNlList();

  @NotNull
  KobraRparen getRparen();

  @NotNull
  List<KobraSemicolon> getSemicolonList();

  @NotNull
  List<KobraControlStructureBody> getControlStructureBodyList();

  @NotNull
  KobraExpression getExpression();

}
