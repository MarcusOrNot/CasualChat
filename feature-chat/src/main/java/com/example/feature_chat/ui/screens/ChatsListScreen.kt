package com.example.feature_chat.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.feature_chat.presentation.viewmodels.ChatViewModel
import com.example.feature_chat.ui.items.ChatListItem

@Composable
fun ChatsScreenList() {

    val vm:ChatViewModel = hiltViewModel()

    val chatsList by vm.chats.observeAsState(listOf())

    vm.showChats()

    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn {
            items(chatsList) { chat->
                ChatListItem(chat = chat)
            }
        }
    }

}