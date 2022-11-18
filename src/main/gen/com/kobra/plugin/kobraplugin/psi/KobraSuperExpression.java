// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraSuperExpression extends PsiElement {

  @Nullable
  KobraLangle getLangle();

  @NotNull
  List<KobraNl> getNlList();

  @Nullable
  KobraRangle getRangle();

  @NotNull
  KobraSuper getSuper();

  @Nullable
  KobraType getType();

}
