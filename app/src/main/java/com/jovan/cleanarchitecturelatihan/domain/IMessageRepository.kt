package com.jovan.cleanarchitecturelatihan.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}