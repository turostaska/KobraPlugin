// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraValueArgument extends PsiElement {

  @Nullable
  KobraAssignment getAssignment();

  @Nullable
  KobraMult getMult();

  @NotNull
  List<KobraNl> getNlList();

  @NotNull
  KobraExpression getExpression();

  @Nullable
  KobraSimpleIdentifier getSimpleIdentifier();

}
