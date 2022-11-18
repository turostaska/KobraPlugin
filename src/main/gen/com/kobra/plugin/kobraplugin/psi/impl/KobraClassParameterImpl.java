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

public class KobraClassParameterImpl extends ASTWrapperPsiElement implements KobraClassParameter {

  public KobraClassParameterImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KobraVisitor visitor) {
    visitor.visitClassParameter(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KobraVisitor) accept((KobraVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KobraAssignment getAssignment() {
    return findChildByClass(KobraAssignment.class);
  }

  @Override
  @NotNull
  public KobraColon getColon() {
    return findNotNullChildByClass(KobraColon.class);
  }

  @Override
  @NotNull
  public List<KobraNl> getNlList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KobraNl.class);
  }

  @Override
  @Nullable
  public KobraVal getVal() {
    return findChildByClass(KobraVal.class);
  }

  @Override
  @Nullable
  public KobraVar getVar() {
    return findChildByClass(KobraVar.class);
  }

  @Override
  @Nullable
  public KobraExpression getExpression() {
    return findChildByClass(KobraExpression.class);
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
