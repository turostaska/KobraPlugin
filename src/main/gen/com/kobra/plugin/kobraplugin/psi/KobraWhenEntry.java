// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraWhenEntry extends PsiElement {

  @NotNull
  KobraArrow getArrow();

  @NotNull
  List<KobraComma> getCommaList();

  @Nullable
  KobraElse getElse();

  @NotNull
  List<KobraNl> getNlList();

  @NotNull
  KobraControlStructureBody getControlStructureBody();

  @Nullable
  KobraSemi getSemi();

  @NotNull
  List<KobraWhenCondition> getWhenConditionList();

}
