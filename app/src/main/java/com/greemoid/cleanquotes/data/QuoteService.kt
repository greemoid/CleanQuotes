package com.greemoid.cleanquotes.data

import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.GET

interface QuoteService {
    @GET("inspiration")
    suspend fun getQuote(): QuoteServerModel
}