package com.example.feature_chat.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.example.core_domain.repository.chats.ChatsListRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
internal class ChatViewModel @Inject constructor (
    private val chatsData: ChatsListRepo
): ViewModel() {




    fun showChats() {
       //println(chatsData.getChatsList().toString())
    }

}