package com.greemoid.cleanquotes.di

import com.greemoid.cleanquotes.core.presentation.Communication
import com.greemoid.cleanquotes.presentation.BaseCommunication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class PresentationModule {

    @Provides
    @Singleton
    fun provideCommunication(): Communication {
        return BaseCommunication()
    }
}