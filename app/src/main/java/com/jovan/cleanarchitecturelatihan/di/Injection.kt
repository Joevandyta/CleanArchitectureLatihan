package com.jovan.cleanarchitecturelatihan.di

import com.jovan.cleanarchitecturelatihan.data.IMessageDataSource
import com.jovan.cleanarchitecturelatihan.data.MessageDataSource
import com.jovan.cleanarchitecturelatihan.data.MessageRepository
import com.jovan.cleanarchitecturelatihan.domain.IMessageRepository
import com.jovan.cleanarchitecturelatihan.domain.MessageInteractor
import com.jovan.cleanarchitecturelatihan.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase{
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }
    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}