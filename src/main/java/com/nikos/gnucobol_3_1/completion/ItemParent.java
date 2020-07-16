package com.nikos.gnucobol_3_1.completion;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import com.nikos.gnucobol_3_1.CobolUtil;
import com.nikos.gnucobol_3_1.psi.CobolItemDecl_;
import com.nikos.gnucobol_3_1.psi.CobolItemUsage_;
import org.jetbrains.annotations.NotNull;

class ItemParent extends ProgramItems {
    @Override
    public void addCompletions(@NotNull CompletionParameters parameters, @NotNull ProcessingContext context, @NotNull CompletionResultSet resultSet) {
        PsiElement typed = parameters.getPosition();

        CobolItemUsage_ prevItemUsage = CobolUtil.previousItemUsage(typed, false);
        if (prevItemUsage == null) return;

        CobolItemDecl_ declaration = prevItemUsage.declaration();
        if (declaration == null) {
            return;
        }

        CobolItemDecl_ parent = declaration.parent();

        if (parent != null) {
            resultSet.addElement(createLookupElement(parent));
        }

        resultSet.stopHere();
    }
}
