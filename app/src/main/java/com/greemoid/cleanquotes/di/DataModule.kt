package com.greemoid.cleanquotes.di

import android.content.Context
import com.greemoid.cleanquotes.core.BaseResourceManager
import com.greemoid.cleanquotes.core.FailureFactory
import com.greemoid.cleanquotes.data.QuoteCloudDataSource
import com.greemoid.cleanquotes.data.QuoteService
import com.greemoid.cleanquotes.domain.QuoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun provideQuoteDataSource(
        @ApplicationContext context: Context,
        quoteService: QuoteService,
    ): QuoteRepository {
        return QuoteCloudDataSource(quoteService,
            FailureFactory(BaseResourceManager(context)))
    }


}