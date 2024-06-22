package com.example.core_domain.repository.chats

import com.example.core_domain.models.Chat

interface ChatsListRepo {

    suspend fun getChatsList(): List<Chat>

}