package com.example.data.room.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "chats")
data class ChatEntity(
    @PrimaryKey @ColumnInfo(name = "_id") val id: Int,
    @ColumnInfo (name = "user_id") val userID: Int
)