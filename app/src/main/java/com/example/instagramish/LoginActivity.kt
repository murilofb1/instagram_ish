package com.example.instagramish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.airbnb.paris.extensions.style
import com.example.instagramish.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    lateinit var navHelper: NavHelper.LoginHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        navHelper = NavHelper(this).LoginHelper()
        binding.btnRegister.setOnClickListener {
            navHelper.goToRegister()
        }
        binding.btnLogin.setOnClickListener {
            binding.btnLogin.style(R.style.ButtonThemes_Disabled)
        }
        setContentView(binding.root)
    }
}