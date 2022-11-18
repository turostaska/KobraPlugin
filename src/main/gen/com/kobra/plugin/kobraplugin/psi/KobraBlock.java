// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraBlock extends PsiElement {

  @NotNull
  KobraLcurl getLcurl();

  @NotNull
  List<KobraNl> getNlList();

  @NotNull
  KobraRcurl getRcurl();

  @NotNull
  KobraStatements getStatements();

}
