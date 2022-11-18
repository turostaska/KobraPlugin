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

public class KobraWhenSubjectImpl extends ASTWrapperPsiElement implements KobraWhenSubject {

  public KobraWhenSubjectImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KobraVisitor visitor) {
    visitor.visitWhenSubject(this);
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
  @Nullable
  public KobraVal getVal() {
    return findChildByClass(KobraVal.class);
  }

  @Override
  @NotNull
  public KobraExpression getExpression() {
    return findNotNullChildByClass(KobraExpression.class);
  }

  @Override
  @Nullable
  public KobraVariableDeclaration getVariableDeclaration() {
    return findChildByClass(KobraVariableDeclaration.class);
  }

}
