package com.example.data

import android.content.Context
import androidx.test.core.app.ApplicationProvider

object TestInfo {
    val context: Context by lazy {
        ApplicationProvider.getApplicationContext<Context>()
    }

}