package com.greemoid.cleanquotes.domain

import javax.inject.Inject


class GetQuoteUseCase @Inject constructor(private val repository: QuoteRepository) {
    suspend fun getQuote(): QuoteItem = repository.getQuote()
}