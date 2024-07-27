package com.example.feature_chat.ui.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.core_domain.models.Chat
import com.example.core_utils.TextStylePresets
import com.example.feature_chat.R

@Composable
fun ChatListItem(chat: Chat) {

    Row(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painterResource(id = R.drawable.user_icon),
            contentDescription = "User Icon",
            modifier = Modifier.size(24.dp)
        )
        Column {
            Text(
                text = "Here test name",
                style = TextStylePresets.nameText
            )
            Text(
                text = "Message text"
            )
        }
    }
}