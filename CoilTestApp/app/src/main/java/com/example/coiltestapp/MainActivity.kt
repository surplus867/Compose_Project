package com.example.coiltestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import coil.transform.GrayscaleTransformation
import coil.transform.RoundedCornersTransformation
import com.example.coiltestapp.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView.load(R.drawable.demonslayer){
            crossfade(true)
            crossfade(400)
            transformations(GrayscaleTransformation())

        }
    }
}