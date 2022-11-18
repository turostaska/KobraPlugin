// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraClassDeclaration extends PsiElement {

  @NotNull
  KobraClass_ getClass_();

  @Nullable
  KobraColon getColon();

  @NotNull
  List<KobraNl> getNlList();

  @Nullable
  KobraClassBody getClassBody();

  @Nullable
  KobraDelegationSpecifiers getDelegationSpecifiers();

  @Nullable
  KobraPrimaryConstructor getPrimaryConstructor();

  @NotNull
  KobraSimpleIdentifier getSimpleIdentifier();

}
