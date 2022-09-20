package com.greemoid.cleanquotes.presentation

abstract class QuoteUiModel(
    private val quote: String,
    private val author: String,
) {
    fun text() = "$quote\n$author"
}

class BaseQuoteUiModel(
    private val quote: String,
    private val author: String,
) : QuoteUiModel(quote, author)

class FailedQuoteUiModel(
    private val failure: String,
) : QuoteUiModel(failure, "")