package com.greemoid.cleanquotes.data

import com.google.gson.annotations.SerializedName
import com.greemoid.cleanquotes.core.Mapper
import com.greemoid.cleanquotes.domain.QuoteItem

data class QuoteServerModel(
    @SerializedName("quote") private val quote: String,
    @SerializedName("author") private val author: String
) : Mapper<QuoteItem> {
    override fun map(): QuoteItem = QuoteItem.Success(author, quote)
}