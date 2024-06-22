package com.example.data.room.implementations

import com.example.core_domain.repository.chats.ChatsListRepo
import com.example.data.TestInfo
import com.example.data.room.CustomRoomInstance
import com.example.data.room.TestRoomInstance
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class ChatCreateTest {
    private val createChatRepo = RoomChatCreateImpl(TestRoomInstance.getInstance(TestInfo.context))
    private val _chatsList: ChatsListRepo = RoomChatsListImpl(TestRoomInstance.getInstance(TestInfo.context))

    @Test
    fun testCreateChat() = runBlocking {
        createChatRepo.createChat(25)
        Assert.assertTrue(_chatsList.getChatsList().size>0)
    }

}