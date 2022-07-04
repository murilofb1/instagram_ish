package com.example.instagramish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instagramish.databinding.ActivityLoginBinding
import com.example.instagramish.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegisterBinding
    lateinit var navHelper: NavHelper.RegisterHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        navHelper = NavHelper(this).RegisterHelper()
        binding.btnConfirm.setOnClickListener {
            navHelper.goToLogin()
        }
        setContentView(binding.root)
    }
}