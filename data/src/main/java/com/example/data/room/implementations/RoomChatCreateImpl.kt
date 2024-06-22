package com.example.data.room.implementations

import com.example.core_domain.repository.chats.ChatCreateRepo
import com.example.data.room.CustomDatabase
import com.example.data.room.entities.ChatEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RoomChatCreateImpl(val data: CustomDatabase): ChatCreateRepo {
    override suspend fun createChat(userID: Int): Int = withContext(Dispatchers.IO) {
        return@withContext data.chatsDao().insertNewChat(chatEntity = ChatEntity(0, userID)).toInt()
    }
}