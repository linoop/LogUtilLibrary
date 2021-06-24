package com.example.logutilmylibrary

import android.util.Log

class LogUtility {
    companion object {
        private const val TAG = "LogUtility"

        fun debug(message: String) {
            Log.d(TAG, message)
        }

        fun error(message: String) {
            Log.e(TAG, message)
        }

        fun warning(message: String) {
            Log.w(TAG, message)
        }

    }
}