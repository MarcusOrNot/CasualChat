package com.example.feature_chat

import com.example.di.DataModule
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class GetChatsTest {

    private val chatsRepo = DataModule.providesChatsListRepo()

    @Test
    fun getChatsTest() = runBlocking {
        var chatsCount = chatsRepo.getChatsList()
        Assert.assertTrue(chatsCount.size>0)
    }

}