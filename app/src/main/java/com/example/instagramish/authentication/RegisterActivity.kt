package com.example.instagramish.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.airbnb.paris.extensions.style
import com.example.instagramish.helpers.NavHelper
import com.example.instagramish.R
import com.example.instagramish.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegisterBinding
    lateinit var navHelper: NavHelper.RegisterHelper
    lateinit var viewModel: RegisterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)
        navHelper = NavHelper(this).RegisterHelper()
        viewModel.registerButtonStatus.observe(this) {
            toggleConfirmButton(it)
        }

        viewModel.registerSuccessful.observe(this) {
            if (it) navHelper.goToHome()
        }

        binding.btnConfirm.setOnClickListener {
            viewModel.validateFields(getEmailStr(), getPsswdStr(), getPsswdConfirmStr())
        }
        setContentView(binding.root)
    }

    private fun getEmailStr(): String = binding.edtTxtRegEmail.text.toString()
    private fun getPsswdStr(): String = binding.edtTxtRegPsswd.text.toString()
    private fun getPsswdConfirmStr(): String = binding.edtTxtConfirmPsswd.text.toString()

    private fun toggleConfirmButton(value: Boolean) {
        if (value) binding.btnConfirm.style(R.style.ButtonThemes_Disabled)
        else binding.btnConfirm.style(R.style.ButtonThemes_Default)
    }

}