package com.example.whatsappchat.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.feature_chat.ui.screens.ChatsScreenList

@Composable
fun MainActivityScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Here must show")
        ChatsScreenList()
    }
}