package com.jovan.cleanarchitecturelatihan.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}