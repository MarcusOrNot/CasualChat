package com.example.data.room

import com.example.core_domain.models.Chat
import com.example.core_domain.repository.ChatsListRepo

internal class RoomChatsListImpl: ChatsListRepo {
    override fun getChatsList(): List<Chat> {
        return listOf(Chat(13))
    }
}