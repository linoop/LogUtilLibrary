package com.example.logutilmylibrary

import android.util.Log

class LogUtility {

    fun debug(message: String) {
        Log.d(Companion.TAG, message)
    }

    fun error(message: String) {
        Log.e(TAG, message)
    }

    fun warning(message: String) {
        Log.w(TAG, message)
    }

    companion object {
        private const val TAG = "LogUtility"
    }
}