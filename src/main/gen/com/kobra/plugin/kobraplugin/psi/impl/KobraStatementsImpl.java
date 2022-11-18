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

public class KobraStatementsImpl extends ASTWrapperPsiElement implements KobraStatements {

  public KobraStatementsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KobraVisitor visitor) {
    visitor.visitStatements(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KobraVisitor) accept((KobraVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<KobraSemis> getSemisList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KobraSemis.class);
  }

  @Override
  @NotNull
  public List<KobraStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KobraStatement.class);
  }

}
