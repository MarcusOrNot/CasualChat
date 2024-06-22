package com.example.data.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.room.entities.ChatEntity

@Dao
interface ChatsDao {

    @Query("Select * From chats")
    suspend fun getAllChats(): List<ChatEntity>

    @Insert(entity = ChatEntity::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNewChat(chatEntity: ChatEntity): Long

}