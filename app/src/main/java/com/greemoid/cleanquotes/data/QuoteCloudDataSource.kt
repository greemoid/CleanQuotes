package com.greemoid.cleanquotes.data

import com.greemoid.cleanquotes.core.FailureHandler
import com.greemoid.cleanquotes.domain.QuoteItem
import com.greemoid.cleanquotes.domain.QuoteRepository

class QuoteCloudDataSource(
    private val quoteService: QuoteService,
    private val failureHandler: FailureHandler,
) : QuoteRepository {
    override suspend fun getQuote(): QuoteItem {
        return try {
            quoteService.getQuote().map()
        } catch (e: Exception) {
            QuoteItem.Failed(failureHandler.handle(e))
        }
    }
}