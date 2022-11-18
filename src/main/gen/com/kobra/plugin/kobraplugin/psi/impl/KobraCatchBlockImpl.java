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

public class KobraCatchBlockImpl extends ASTWrapperPsiElement implements KobraCatchBlock {

  public KobraCatchBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KobraVisitor visitor) {
    visitor.visitCatchBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KobraVisitor) accept((KobraVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public KobraCatch getCatch() {
    return findNotNullChildByClass(KobraCatch.class);
  }

  @Override
  @NotNull
  public KobraColon getColon() {
    return findNotNullChildByClass(KobraColon.class);
  }

  @Override
  @Nullable
  public KobraComma getComma() {
    return findChildByClass(KobraComma.class);
  }

  @Override
  @NotNull
  public KobraLparen getLparen() {
    return findNotNullChildByClass(KobraLparen.class);
  }

  @Override
  @NotNull
  public List<KobraNl> getNlList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KobraNl.class);
  }

  @Override
  @NotNull
  public KobraRparen getRparen() {
    return findNotNullChildByClass(KobraRparen.class);
  }

  @Override
  @NotNull
  public KobraBlock getBlock() {
    return findNotNullChildByClass(KobraBlock.class);
  }

  @Override
  @NotNull
  public KobraSimpleIdentifier getSimpleIdentifier() {
    return findNotNullChildByClass(KobraSimpleIdentifier.class);
  }

  @Override
  @NotNull
  public KobraType getType() {
    return findNotNullChildByClass(KobraType.class);
  }

}
