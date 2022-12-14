package com.greemoid.cleanquotes.core

import android.content.Context

class BaseResourceManager(private val context: Context) : ResourceManager {
    override fun getString(stringRes: Int): String = context.getString(stringRes)

}