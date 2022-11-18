// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraRangeTest extends PsiElement {

  @NotNull
  List<KobraNl> getNlList();

  @NotNull
  KobraExpression getExpression();

  @NotNull
  KobraInOperator getInOperator();

}
