package com.greemoid.cleanquotes.data

import retrofit2.http.GET

interface QuoteService {
    @GET("random")
    suspend fun getQuote(): AnimeQuoteServerModel
}