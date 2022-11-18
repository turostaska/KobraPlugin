// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraClassParameter extends PsiElement {

  @Nullable
  KobraAssignment getAssignment();

  @NotNull
  KobraColon getColon();

  @NotNull
  List<KobraNl> getNlList();

  @Nullable
  KobraVal getVal();

  @Nullable
  KobraVar getVar();

  @Nullable
  KobraExpression getExpression();

  @NotNull
  KobraSimpleIdentifier getSimpleIdentifier();

  @NotNull
  KobraType getType();

}
