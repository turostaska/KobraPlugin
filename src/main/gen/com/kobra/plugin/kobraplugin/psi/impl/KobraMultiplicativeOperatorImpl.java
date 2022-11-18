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

public class KobraMultiplicativeOperatorImpl extends ASTWrapperPsiElement implements KobraMultiplicativeOperator {

  public KobraMultiplicativeOperatorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KobraVisitor visitor) {
    visitor.visitMultiplicativeOperator(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KobraVisitor) accept((KobraVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KobraDiv getDiv() {
    return findChildByClass(KobraDiv.class);
  }

  @Override
  @Nullable
  public KobraMod getMod() {
    return findChildByClass(KobraMod.class);
  }

  @Override
  @Nullable
  public KobraMult getMult() {
    return findChildByClass(KobraMult.class);
  }

}
