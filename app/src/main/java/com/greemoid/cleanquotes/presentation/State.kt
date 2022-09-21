package com.greemoid.cleanquotes.presentation

import com.greemoid.cleanquotes.core.presentation.ShowText
import com.greemoid.cleanquotes.core.presentation.ShowView

sealed class State {

    protected abstract val type: Int

    companion object {
        const val INITIAL = 0
        const val PROGRESS = 1
        const val FAILED = 2
    }

    fun isType(type: Int): Boolean = this.type == type

    fun show(
        progress: ShowView,
        button: ShowView,
        textView: ShowText,
    ) {
        show(progress, button)
        show(textView)
    }

    protected open fun show(button: ShowView, progress: ShowView) {}
    protected open fun show(textView: ShowText) {}

    object Progress : State() {
        override val type: Int = PROGRESS

        override fun show(button: ShowView, progress: ShowView) {
            button.show(true)
            progress.show(false)
        }
    }

    abstract class Info(private val text: String) : State() {
        override fun show(textView: ShowText) {
            textView.show(text)
        }

        override fun show(button: ShowView, progress: ShowView) {
            button.show(false)
            progress.show(true)
        }
    }

    class Initial(text: String) : Info(text) {
        override val type: Int = INITIAL
    }

    class Failed(text: String) : Info(text) {
        override val type: Int = FAILED
    }
}