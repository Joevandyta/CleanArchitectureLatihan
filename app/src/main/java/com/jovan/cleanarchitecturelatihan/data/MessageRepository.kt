package com.jovan.cleanarchitecturelatihan.data

import com.jovan.cleanarchitecturelatihan.domain.IMessageRepository
import com.jovan.cleanarchitecturelatihan.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}