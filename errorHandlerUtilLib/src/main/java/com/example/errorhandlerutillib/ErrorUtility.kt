package com.example.errorhandlerutillib

import android.util.Log

class ErrorUtility {
    companion object {
        const val TAG = "error utility"
        fun showError(message: String) {
            Log.e(TAG, message)
        }
    }
}