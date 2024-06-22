package com.example.data.room

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

object CustomRoomInstance {
    private var _room: CustomDatabase? = null

    fun getInstance(context: Context): CustomDatabase {
        if (_room!=null) return _room!!
        _room = Room.databaseBuilder(
            context,
            CustomDatabase::class.java, "custom_database"
        ).fallbackToDestructiveMigration()
            .build()
        return _room!!
    }

}