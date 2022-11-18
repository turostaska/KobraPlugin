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

public class KobraImportHeaderImpl extends ASTWrapperPsiElement implements KobraImportHeader {

  public KobraImportHeaderImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KobraVisitor visitor) {
    visitor.visitImportHeader(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KobraVisitor) accept((KobraVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KobraDot getDot() {
    return findChildByClass(KobraDot.class);
  }

  @Override
  @NotNull
  public KobraImport getImport() {
    return findNotNullChildByClass(KobraImport.class);
  }

  @Override
  @Nullable
  public KobraMult getMult() {
    return findChildByClass(KobraMult.class);
  }

  @Override
  @NotNull
  public KobraIdentifier getIdentifier() {
    return findNotNullChildByClass(KobraIdentifier.class);
  }

  @Override
  @Nullable
  public KobraImportAlias getImportAlias() {
    return findChildByClass(KobraImportAlias.class);
  }

  @Override
  @Nullable
  public KobraSemi getSemi() {
    return findChildByClass(KobraSemi.class);
  }

}
