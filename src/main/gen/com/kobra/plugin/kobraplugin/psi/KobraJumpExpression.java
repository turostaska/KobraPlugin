// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraJumpExpression extends PsiElement {

  @Nullable
  KobraBreak getBreak();

  @Nullable
  KobraContinue getContinue();

  @NotNull
  List<KobraNl> getNlList();

  @Nullable
  KobraReturn getReturn();

  @Nullable
  KobraThrow getThrow();

  @Nullable
  KobraExpression getExpression();

}
