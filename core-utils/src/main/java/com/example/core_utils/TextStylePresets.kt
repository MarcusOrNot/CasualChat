package com.example.core_utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object TextStylePresets {
    val nameText = TextStyle(
        fontSize = 16.sp,
        color = Color.Black,
        fontWeight = FontWeight.Bold
    )

    val normalText = TextStyle(
        fontSize = 16.sp,
        color = Color.DarkGray,
        fontWeight = FontWeight.Normal
    )
}