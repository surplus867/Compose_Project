package com.example.activitydemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class AnotherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        val keyValue1 = intent.getStringExtra("key1")
        val keyValue2 = intent.getDoubleExtra("key2", 1.337)
        if(keyValue1 != null) {
            Log.e("keyValue1 is", keyValue1)
        }
        if(keyValue2 != null){
            Log.e("keyValue2 is", keyValue2.toString())
        }

    }
}