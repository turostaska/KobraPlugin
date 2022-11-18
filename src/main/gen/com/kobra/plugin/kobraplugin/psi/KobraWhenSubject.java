// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraWhenSubject extends PsiElement {

  @Nullable
  KobraAssignment getAssignment();

  @NotNull
  KobraLparen getLparen();

  @NotNull
  List<KobraNl> getNlList();

  @NotNull
  KobraRparen getRparen();

  @Nullable
  KobraVal getVal();

  @NotNull
  KobraExpression getExpression();

  @Nullable
  KobraVariableDeclaration getVariableDeclaration();

}
