package com.example.feature_chat.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core_domain.models.Chat
import com.example.core_domain.repository.chats.ChatsListRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
internal class ChatViewModel @Inject constructor (
    private val chatsData: ChatsListRepo
): ViewModel() {
    private val _chats: MutableLiveData<List<Chat>> by lazy { MutableLiveData<List<Chat>>() }
    val chats: LiveData<List<Chat>> = _chats


    fun showChats() {
        viewModelScope.launch {
            //println(chatsData.getChatsList().toString())
            _chats.value = chatsData.getChatsList()
        }
    }

}