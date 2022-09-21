package com.greemoid.cleanquotes.presentation

import android.util.Log
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.greemoid.cleanquotes.core.CommonViewModel
import com.greemoid.cleanquotes.core.presentation.Communication
import com.greemoid.cleanquotes.domain.GetQuoteUseCase
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel(
    private val useCase: GetQuoteUseCase,
    private val communication: Communication,
    private val dispatcher: CoroutineDispatcher = Dispatchers.Main,
) : ViewModel(), CommonViewModel {


    override fun getQuote() {
        viewModelScope.launch(dispatcher) {
            communication.showState(State.Progress)
            Log.d("VM", communication.isState(State.PROGRESS).toString())
            useCase.getQuote().map().show(communication)
            Log.d("VM", communication.isState(State.INITIAL).toString())
        }
    }

    override fun observe(owner: LifecycleOwner, observer: Observer<State>) =
        communication.observe(owner, observer)
}