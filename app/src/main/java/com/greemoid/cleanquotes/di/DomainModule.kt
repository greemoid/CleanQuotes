package com.greemoid.cleanquotes.di

import com.greemoid.cleanquotes.domain.GetQuoteUseCase
import com.greemoid.cleanquotes.domain.QuoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun provideGetQuoteUseCase(repository: QuoteRepository): GetQuoteUseCase {
        return GetQuoteUseCase(repository)
    }
}