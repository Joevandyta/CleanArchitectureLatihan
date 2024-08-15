package com.jovan.cleanarchitecturelatihan.data

import com.jovan.cleanarchitecturelatihan.domain.MessageEntity

class MessageDataSource : IMessageDataSource{
    override fun getMessageFromSource(name: String): MessageEntity = MessageEntity("Hello $name! Welcome to Clean Architecture")
}