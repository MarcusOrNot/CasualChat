package com.example.core_domain.repository

import com.example.core_domain.models.Chat

interface ChatsListRepo {

    fun getChatsList(): List<Chat>

}