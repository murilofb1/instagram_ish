package com.example.instagramish

import android.app.Activity
import android.content.Intent

class NavHelper(val activity: Activity) {
    //LOGIN NAVIGATION
    inner class LoginHelper {
        fun goToRegister() {
            val i = Intent(activity, RegisterActivity::class.java)
            activity.startActivity(i)
        }

        fun goToMain() {}
    }

    //REGISTER NAVIGATION
    inner class RegisterHelper {
        fun goToLogin() { activity.finish() }
    }
}