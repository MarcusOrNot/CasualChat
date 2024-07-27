package com.example.feature_chat.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core_domain.repository.chats.ChatsListRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
internal class ChatViewModel @Inject constructor (
    private val chatsData: ChatsListRepo
): ViewModel() {




    fun showChats() {
        viewModelScope.launch {
            println(chatsData.getChatsList().toString())
        }
    }

}