package com.example.instagramish.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instagramish.R
import com.example.instagramish.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}