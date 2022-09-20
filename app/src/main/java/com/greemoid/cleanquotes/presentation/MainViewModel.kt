package com.greemoid.cleanquotes.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.greemoid.cleanquotes.core.CommonViewModel
import com.greemoid.cleanquotes.domain.GetQuoteUseCase
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(
    private val useCase: GetQuoteUseCase,
    private val dispatcher: CoroutineDispatcher = Dispatchers.Main
) : ViewModel(), CommonViewModel {
    private val _text = MutableLiveData<String>()
    val text: LiveData<String> = _text

    override fun getQuote() {
        viewModelScope.launch(dispatcher) {
            _text.value = useCase.getQuote().map().text()
        }
    }
}