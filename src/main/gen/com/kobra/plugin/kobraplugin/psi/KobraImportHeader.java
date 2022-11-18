// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraImportHeader extends PsiElement {

  @Nullable
  KobraDot getDot();

  @NotNull
  KobraImport getImport();

  @Nullable
  KobraMult getMult();

  @NotNull
  KobraIdentifier getIdentifier();

  @Nullable
  KobraImportAlias getImportAlias();

  @Nullable
  KobraSemi getSemi();

}
