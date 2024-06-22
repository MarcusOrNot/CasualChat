package com.example.core_utils

import android.content.Context

object Info {
    private lateinit var _context: Context
    val context by lazy { _context }

    fun init(context: Context) {
        _context = context
    }

}