package com.greemoid.cleanquotes.data

import com.greemoid.cleanquotes.core.Mapper
import com.greemoid.cleanquotes.domain.QuoteItem

data class AnimeQuoteServerModel(
    private val anime: String,
    private val character: String,
    private val quote: String,
) : Mapper<QuoteItem>{
    private fun character() = "$character <<$anime>>"
    override fun map(): QuoteItem = QuoteItem.Success(character(), quote)
}