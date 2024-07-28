package com.example.feature_chat.ui.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.core_domain.models.Chat
import com.example.core_utils.TextStylePresets
import com.example.feature_chat.R

@Composable
fun ChatListItem(chat: Chat) {

    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(14.dp)
    ) {
        Image(
            painterResource(id = R.drawable.user_icon),
            contentDescription = "User Icon",
            modifier = Modifier.size(48.dp)
        )
        Spacer(modifier = Modifier.width(14.dp))
        Column {
            Text(
                text = "Here test name",
                style = TextStylePresets.nameText,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "Message text",
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Divider(
                color = Color.Gray,
                thickness = 1.dp
            )
        }
    }
}