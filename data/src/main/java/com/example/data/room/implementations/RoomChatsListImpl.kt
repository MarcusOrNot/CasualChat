package com.example.data.room.implementations

import com.example.core_domain.models.Chat
import com.example.core_domain.repository.chats.ChatsListRepo
import com.example.data.room.CustomDatabase
import com.example.data.room.CustomRoomMappers
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

internal class RoomChatsListImpl(room: CustomDatabase): ChatsListRepo {
    private val chatsDao by lazy { room.chatsDao() }
    override suspend fun getChatsList(): List<Chat> = withContext(Dispatchers.IO) {
        //return listOf(Chat(13, 24))
        return@withContext chatsDao.getAllChats().map { CustomRoomMappers.mapEntityToChat(it) }
    }
}