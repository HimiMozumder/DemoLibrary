package com.braincraftapps.droid.toastlibrary

import android.content.Context
import android.widget.Toast

class ToastMessage {
    companion object {
        fun toastMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}