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

public class KobraFunctionDeclarationImpl extends ASTWrapperPsiElement implements KobraFunctionDeclaration {

  public KobraFunctionDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KobraVisitor visitor) {
    visitor.visitFunctionDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KobraVisitor) accept((KobraVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KobraColon getColon() {
    return findChildByClass(KobraColon.class);
  }

  @Override
  @NotNull
  public KobraFun getFun() {
    return findNotNullChildByClass(KobraFun.class);
  }

  @Override
  @NotNull
  public List<KobraNl> getNlList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KobraNl.class);
  }

  @Override
  @NotNull
  public KobraFunctionBody getFunctionBody() {
    return findNotNullChildByClass(KobraFunctionBody.class);
  }

  @Override
  @NotNull
  public KobraFunctionParameters getFunctionParameters() {
    return findNotNullChildByClass(KobraFunctionParameters.class);
  }

  @Override
  @NotNull
  public KobraSimpleIdentifier getSimpleIdentifier() {
    return findNotNullChildByClass(KobraSimpleIdentifier.class);
  }

  @Override
  @Nullable
  public KobraType getType() {
    return findChildByClass(KobraType.class);
  }

}
