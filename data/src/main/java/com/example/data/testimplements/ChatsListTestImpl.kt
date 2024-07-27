package com.example.data.testimplements

import com.example.core_domain.models.Chat
import com.example.core_domain.repository.chats.ChatsListRepo

internal class ChatsListTestImpl: ChatsListRepo {
    override suspend fun getChatsList(): List<Chat> {
        return listOf<Chat>(
            Chat(1, 1),
            Chat(2, 2),
            Chat(3, 3),
            Chat(4, 4),
            Chat(5, 5)
        )
    }
}