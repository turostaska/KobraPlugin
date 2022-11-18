// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraCatchBlock extends PsiElement {

  @NotNull
  KobraCatch getCatch();

  @NotNull
  KobraColon getColon();

  @Nullable
  KobraComma getComma();

  @NotNull
  KobraLparen getLparen();

  @NotNull
  List<KobraNl> getNlList();

  @NotNull
  KobraRparen getRparen();

  @NotNull
  KobraBlock getBlock();

  @NotNull
  KobraSimpleIdentifier getSimpleIdentifier();

  @NotNull
  KobraType getType();

}
