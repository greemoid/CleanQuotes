package com.greemoid.cleanquotes.core

import com.greemoid.cleanquotes.R

interface Failure {
    fun getMessage(): String
}

class NoConnection(private val resourceManager: ResourceManager) : Failure {
    override fun getMessage(): String = resourceManager.getString(R.string.no_connection)
}

class ServiceUnavailable(private val resourceManager: ResourceManager) : Failure {
    override fun getMessage(): String = resourceManager.getString(R.string.service_unavailable)
}

class GenericError(private val resourceManager: ResourceManager) : Failure {
    override fun getMessage(): String = resourceManager.getString(R.string.generic_exception)
}