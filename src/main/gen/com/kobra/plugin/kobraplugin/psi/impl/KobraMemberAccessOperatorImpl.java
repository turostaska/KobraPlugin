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

public class KobraMemberAccessOperatorImpl extends ASTWrapperPsiElement implements KobraMemberAccessOperator {

  public KobraMemberAccessOperatorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KobraVisitor visitor) {
    visitor.visitMemberAccessOperator(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KobraVisitor) accept((KobraVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KobraColoncolon getColoncolon() {
    return findChildByClass(KobraColoncolon.class);
  }

  @Override
  @Nullable
  public KobraDot getDot() {
    return findChildByClass(KobraDot.class);
  }

  @Override
  @NotNull
  public List<KobraNl> getNlList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KobraNl.class);
  }

}
