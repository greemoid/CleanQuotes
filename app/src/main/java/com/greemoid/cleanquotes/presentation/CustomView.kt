package com.greemoid.cleanquotes.presentation

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import com.greemoid.cleanquotes.core.presentation.ShowText
import com.greemoid.cleanquotes.core.presentation.ShowView

class CustomTextView : AppCompatTextView, ShowText {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) :
            super(context, attrs, defStyleAttr)

    override fun show(arg: String) {
        text = arg
    }
}

class CustomProgress : ProgressBar, ShowView {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) :
            super(context, attrs, defStyleAttr)

    override fun show(arg: Boolean) {
        visibility = if (arg) View.VISIBLE else View.GONE
    }
}

class CustomButton : AppCompatButton, ShowView {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) :
            super(context, attrs, defStyleAttr)

    override fun show(arg: Boolean) {
        isEnabled = arg
    }
}