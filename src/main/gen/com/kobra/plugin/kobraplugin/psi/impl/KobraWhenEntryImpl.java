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

public class KobraWhenEntryImpl extends ASTWrapperPsiElement implements KobraWhenEntry {

  public KobraWhenEntryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KobraVisitor visitor) {
    visitor.visitWhenEntry(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KobraVisitor) accept((KobraVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public KobraArrow getArrow() {
    return findNotNullChildByClass(KobraArrow.class);
  }

  @Override
  @NotNull
  public List<KobraComma> getCommaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KobraComma.class);
  }

  @Override
  @Nullable
  public KobraElse getElse() {
    return findChildByClass(KobraElse.class);
  }

  @Override
  @NotNull
  public List<KobraNl> getNlList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KobraNl.class);
  }

  @Override
  @NotNull
  public KobraControlStructureBody getControlStructureBody() {
    return findNotNullChildByClass(KobraControlStructureBody.class);
  }

  @Override
  @Nullable
  public KobraSemi getSemi() {
    return findChildByClass(KobraSemi.class);
  }

  @Override
  @NotNull
  public List<KobraWhenCondition> getWhenConditionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KobraWhenCondition.class);
  }

}
