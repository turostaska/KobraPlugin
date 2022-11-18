// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraAssignment extends PsiElement {

  @NotNull
  KobraAssignment getAssignment();

  @NotNull
  List<KobraNl> getNlList();

  @NotNull
  KobraExpression getExpression();

  @NotNull
  KobraIdentifier getIdentifier();

}
