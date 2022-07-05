package com.example.instagramish.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.paris.extensions.style
import com.example.instagramish.helpers.NavHelper
import com.example.instagramish.R
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