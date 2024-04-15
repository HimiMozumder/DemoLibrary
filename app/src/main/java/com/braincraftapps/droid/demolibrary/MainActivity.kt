package com.braincraftapps.droid.demolibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.braincraftapps.droid.toastlibrary.ToastMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToastMessage.toastMessage(this,"SuccessFull attempt")
    }
}