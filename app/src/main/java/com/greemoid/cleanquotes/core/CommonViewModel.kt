package com.greemoid.cleanquotes.core

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.greemoid.cleanquotes.presentation.State

interface CommonViewModel {
    fun getQuote()
    fun observe(owner: LifecycleOwner, observer: Observer<State>)
}