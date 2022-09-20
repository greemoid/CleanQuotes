package com.greemoid.cleanquotes.domain


class GetQuoteUseCase(private val repository: QuoteRepository) {
    suspend fun getQuote(): QuoteItem = repository.getQuote()
}