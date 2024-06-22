package com.example.data.room

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.data.TestInfo

object TestRoomInstance {
    private var _room: CustomDatabase? = null

    fun getInstance(context: Context): CustomDatabase {
        if (_room!=null) return _room!!
        _room = Room.inMemoryDatabaseBuilder(
            context,
            CustomDatabase::class.java,
        ).fallbackToDestructiveMigration()
            .build()
        return _room!!
    }

}