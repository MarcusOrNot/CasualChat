package com.example.feature_chat.ui.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.feature_chat.presentation.viewmodels.ChatViewModel

@Composable
fun ChatsScreenList() {

    val vm:ChatViewModel = hiltViewModel()

    vm.showChats()

}