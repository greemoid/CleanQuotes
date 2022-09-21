package com.greemoid.cleanquotes.presentation

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.greemoid.cleanquotes.core.presentation.Communication

class BaseCommunication : Communication {

    private val liveData = MutableLiveData<State>()

    override fun showState(state: State) {
        liveData.value = state
    }

    override fun observe(owner: LifecycleOwner, observer: Observer<State>) {
        liveData.observe(owner, observer)
    }

    override fun isState(type: Int): Boolean = liveData.value?.isType(type) ?: false

}