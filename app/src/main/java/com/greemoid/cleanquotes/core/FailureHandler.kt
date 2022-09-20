package com.greemoid.cleanquotes.core

interface FailureHandler {
    fun handle(e: Exception): Failure
}