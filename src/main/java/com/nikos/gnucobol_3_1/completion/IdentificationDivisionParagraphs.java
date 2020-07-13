package com.nikos.gnucobol_3_1.completion;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

class IdentificationDivisionParagraphs extends CobolCompletionProvider {
    @Override
    public void addCompletions(@NotNull CompletionParameters parameters, @NotNull ProcessingContext context, @NotNull CompletionResultSet resultSet) {
        resultSet.addElement(LookupElementBuilder.create("author "));
        resultSet.addElement(LookupElementBuilder.create("installation "));
        resultSet.addElement(LookupElementBuilder.create("date-written "));
        resultSet.addElement(LookupElementBuilder.create("date-compiled "));
        resultSet.addElement(LookupElementBuilder.create("author "));
        resultSet.addElement(LookupElementBuilder.create("security "));
    }
}
