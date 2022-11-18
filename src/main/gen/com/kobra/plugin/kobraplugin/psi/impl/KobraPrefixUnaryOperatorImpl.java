// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.kobra.plugin.kobraplugin.psi.KobraTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.kobra.plugin.kobraplugin.psi.*;

public class KobraPrefixUnaryOperatorImpl extends ASTWrapperPsiElement implements KobraPrefixUnaryOperator {

  public KobraPrefixUnaryOperatorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KobraVisitor visitor) {
    visitor.visitPrefixUnaryOperator(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KobraVisitor) accept((KobraVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KobraAdd getAdd() {
    return findChildByClass(KobraAdd.class);
  }

  @Override
  @Nullable
  public KobraSub getSub() {
    return findChildByClass(KobraSub.class);
  }

  @Override
  @Nullable
  public KobraExcl getExcl() {
    return findChildByClass(KobraExcl.class);
  }

}
