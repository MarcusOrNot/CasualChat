package com.example.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.data.room.dao.ChatsDao
import com.example.data.room.entities.ChatEntity
import javax.inject.Inject

@Database(entities = [ChatEntity::class], version = 1, exportSchema = false)
abstract class CustomDatabase: RoomDatabase() {

    abstract fun chatsDao(): ChatsDao

}