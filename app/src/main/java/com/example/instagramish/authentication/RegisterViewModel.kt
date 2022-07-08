package com.example.instagramish.authentication

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.instagramish.R
import com.example.instagramish.firebase.FirebaseAuthentication
import com.example.instagramish.helpers.ToastH

class RegisterViewModel(application: Application) : AndroidViewModel(application) {
    private val appContext = application.applicationContext
    private val toastH = ToastH(appContext)
    val registerButtonStatus = MutableLiveData(false)
    val registerSuccessful = MutableLiveData(false)

    fun validateFields(email: String, psswd: String, psswdConfirm: String): Boolean {
        if (email.isEmpty() && psswd.isEmpty() && psswdConfirm.isEmpty())
            toastH.showToast(appContext.getString(R.string.missing_all_toast))
        else if (email.isEmpty()) toastH.showToast(appContext.getString(R.string.missing_email_toast))
        else if (psswd.isEmpty()) toastH.showToast(appContext.getString(R.string.missing_password_toast))
        else if (psswdConfirm.isEmpty()) toastH.showToast(appContext.getString(R.string.missing_password_confirmation_toast))
        else {
            registerUser(email, psswd)
            return true
        }
        return false
    }

    private fun registerUser(email: String, psswd: String) {
        registerButtonStatus.value = true
        FirebaseAuthentication.registerUser(email, psswd).addOnCompleteListener { result ->
            if (result.isSuccessful) registerSuccessful.value = true
            registerButtonStatus.value = false
        }
    }
}