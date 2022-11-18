// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraFinallyBlock extends PsiElement {

  @NotNull
  KobraFinally getFinally();

  @NotNull
  List<KobraNl> getNlList();

  @NotNull
  KobraBlock getBlock();

}
