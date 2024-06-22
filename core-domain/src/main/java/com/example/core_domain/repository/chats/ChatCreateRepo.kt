package com.example.core_domain.repository.chats

interface ChatCreateRepo {

    suspend fun createChat(userID: Int): Int

}