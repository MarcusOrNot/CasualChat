package com.example.data.room

import com.example.core_domain.models.Chat
import com.example.data.room.entities.ChatEntity

object CustomRoomMappers {

    fun mapEntityToChat(entity: ChatEntity): Chat {
        return Chat( entity.id, entity.userID )
    }

}