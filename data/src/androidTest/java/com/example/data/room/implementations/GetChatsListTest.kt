package com.example.data.room.implementations

import com.example.core_domain.repository.chats.ChatsListRepo
import com.example.data.TestInfo
import com.example.data.room.CustomRoomInstance
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class GetChatsListTest {
    //private val _chatsList: ChatsListRepo = RoomChatsListImpl(TestRoomInstance.getInstance(TestInfo.context))
    //private val _chatsList: ChatsListRepo = RoomChatsListImpl(TestRoomInstance.getInstance())
    private val _chatsList: ChatsListRepo = RoomChatsListImpl(CustomRoomInstance.getInstance(TestInfo.context))

    @Test
    fun testChatsMoreThanZero() = runBlocking {
        Assert.assertTrue(_chatsList.getChatsList().size>0)
    }

    @Test
    fun testChatsEmpty() = runBlocking {
        Assert.assertTrue(_chatsList.getChatsList().size==0)
    }


}