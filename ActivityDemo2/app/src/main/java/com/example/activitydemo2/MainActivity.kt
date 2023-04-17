package com.example.activitydemo2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSubmit = findViewById<Button>(R.id.btn_submit)
        btnSubmit.setOnClickListener {
            val intent = Intent(this, AnotherActivity::class.java).apply {
                putExtra("key1", "Value1")
                putExtra("key2", "1.337")
            }

            startActivity(intent)
        }
    }
}