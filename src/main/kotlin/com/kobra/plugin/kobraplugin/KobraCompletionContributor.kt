package com.kobra.plugin.kobraplugin

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.util.ProcessingContext

private val completions = listOf(
    "print",
    "torch", "transforms", "datasets", "DataLoader", "Tensor",
)

class KobraCompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC, PlatformPatterns.psiElement(),
            object : CompletionProvider<CompletionParameters>() {
                override fun addCompletions(
                    parameters: CompletionParameters,
                    context: ProcessingContext,
                    resultSet: CompletionResultSet,
                ) {
                    completions.forEach {
                        resultSet.addElement(LookupElementBuilder.create(it))
                    }
                }
            }
        )
    }
}