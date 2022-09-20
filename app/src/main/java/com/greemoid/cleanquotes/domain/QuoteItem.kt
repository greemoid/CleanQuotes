package com.greemoid.cleanquotes.domain

import com.greemoid.cleanquotes.core.Mapper
import com.greemoid.cleanquotes.core.Failure
import com.greemoid.cleanquotes.presentation.BaseQuoteUiModel
import com.greemoid.cleanquotes.presentation.FailedQuoteUiModel
import com.greemoid.cleanquotes.presentation.QuoteUiModel

sealed class QuoteItem : Mapper<QuoteUiModel> {

    class Success(
        private val author: String,
        private val quote: String,
    ) : QuoteItem() {
        override fun map(): QuoteUiModel = BaseQuoteUiModel(quote, author)
    }

    class Failed(
        private val failure: Failure,
    ) : QuoteItem() {
        override fun map(): QuoteUiModel = FailedQuoteUiModel(failure.getMessage())
    }
}