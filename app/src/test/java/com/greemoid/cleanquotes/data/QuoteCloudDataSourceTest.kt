package com.greemoid.cleanquotes.data

import com.greemoid.cleanquotes.domain.QuoteItem
import com.greemoid.cleanquotes.domain.QuoteRepository
import kotlinx.coroutines.runBlocking
import org.junit.Test

internal class QuoteCloudDataSourceTest {
    @Test
    fun `get success quote`() = runBlocking {
        val repository = TestQuoteCloudDataSource()
        repository.success = true

        val quote = repository.getQuote()

        val actualText = quote.
    }

    class TestQuoteCloudDataSource(): QuoteRepository {
        var success = false
        override suspend fun getQuote(): QuoteItem {
            return if (success) {
                QuoteItem.Success("illia", "what do you mean?")
            } else {
                QuoteItem.Failed("something went wrong")
            }
        }

    }
}