package com.greemoid.cleanquotes

import android.app.Application
import com.greemoid.cleanquotes.core.BaseResourceManager
import com.greemoid.cleanquotes.core.FailureFactory
import com.greemoid.cleanquotes.data.QuoteCloudDataSource
import com.greemoid.cleanquotes.data.QuoteService
import com.greemoid.cleanquotes.domain.GetQuoteUseCase
import com.greemoid.cleanquotes.presentation.BaseCommunication
import com.greemoid.cleanquotes.presentation.MainViewModel
import dagger.hilt.android.HiltAndroidApp
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://api.goprogram.ai/"

@HiltAndroidApp
class QuoteApp : Application() {

    lateinit var viewModel: MainViewModel

    override fun onCreate() {
        super.onCreate()
        /*val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        viewModel = MainViewModel(useCase = (GetQuoteUseCase(QuoteCloudDataSource(retrofit.create(
            QuoteService::class.java), FailureFactory(BaseResourceManager(this))))),
            communication = BaseCommunication())*/
    }
}