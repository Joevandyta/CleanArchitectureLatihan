package com.jovan.cleanarchitecturelatihan.data

import com.jovan.cleanarchitecturelatihan.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String):MessageEntity
}