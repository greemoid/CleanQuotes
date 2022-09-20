package com.greemoid.cleanquotes.domain

interface QuoteRepository {
    suspend fun getQuote(): QuoteItem
}