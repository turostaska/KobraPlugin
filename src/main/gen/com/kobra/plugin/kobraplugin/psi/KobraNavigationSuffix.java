// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KobraNavigationSuffix extends PsiElement {

  @Nullable
  KobraClass_ getClass_();

  @NotNull
  List<KobraNl> getNlList();

  @NotNull
  KobraMemberAccessOperator getMemberAccessOperator();

  @Nullable
  KobraParenthesizedExpression getParenthesizedExpression();

  @Nullable
  KobraSimpleIdentifier getSimpleIdentifier();

}
