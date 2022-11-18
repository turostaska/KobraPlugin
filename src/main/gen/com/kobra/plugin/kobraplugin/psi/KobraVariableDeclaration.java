// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraVariableDeclaration extends PsiElement {

  @Nullable
  KobraColon getColon();

  @NotNull
  List<KobraNl> getNlList();

  @NotNull
  KobraSimpleIdentifier getSimpleIdentifier();

  @Nullable
  KobraType getType();

}
