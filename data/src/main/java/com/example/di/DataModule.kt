package com.example.di

import com.example.core_domain.repository.chats.ChatCreateRepo
import com.example.core_domain.repository.chats.ChatsListRepo
import com.example.core_utils.Info
import com.example.data.room.CustomRoomInstance
import com.example.data.room.implementations.RoomChatCreateImpl
import com.example.data.room.implementations.RoomChatsListImpl
import com.example.data.testimplements.ChatsListTestImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    /*@Provides
    @Singleton
    fun provideContext(application: Application): Context {
        return application.applicationContext
    }*/

    @Provides
    @Singleton
    fun providesChatsListRepo(): ChatsListRepo {
        //return RoomChatsListImpl(CustomRoomInstance.getInstance(Info.context))
        return ChatsListTestImpl()
    }

    @Provides
    @Singleton
    fun providesChatCreateRepo(): ChatCreateRepo {
        return RoomChatCreateImpl(CustomRoomInstance.getInstance(Info.context))
    }

}