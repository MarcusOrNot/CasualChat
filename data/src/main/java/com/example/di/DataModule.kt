package com.example.di

import com.example.data.room.RoomChatsListImpl
import com.example.core_domain.repository.ChatsListRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun providesChatsListRepo(): com.example.core_domain.repository.ChatsListRepo {
        return RoomChatsListImpl()
    }

}