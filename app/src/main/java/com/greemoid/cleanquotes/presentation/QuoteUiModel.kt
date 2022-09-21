package com.greemoid.cleanquotes.presentation

import com.greemoid.cleanquotes.core.presentation.Communication

abstract class QuoteUiModel(
    private val quote: String,
    private val author: String,
) {
    protected open fun text() = "$quote\n$author"
    open fun show(communication: Communication) =
        communication.showState(State.Initial(text()))
}

class BaseQuoteUiModel(
    quote: String,
    author: String,
) : QuoteUiModel(quote, author)

class FailedQuoteUiModel(
    private val failure: String,
) : QuoteUiModel(failure, "") {
    override fun text(): String = failure
    override fun show(communication: Communication) = communication.showState(State.Failed(text()))
}