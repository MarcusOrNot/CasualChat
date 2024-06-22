package com.example.whatsappchat

import android.app.Application
import com.example.core_utils.Info
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App: Application() {

    override fun onCreate() {
        super.onCreate()
        Info.init(this)
    }

}