package com.example.instagramish.helpers

import android.app.Activity
import android.content.Intent
import com.example.instagramish.authentication.RegisterActivity
import com.example.instagramish.main.HomeActivity

class NavHelper(val activity: Activity) {
    //LOGIN NAVIGATION
    inner class LoginHelper {
        fun goToRegister() {
            val i = Intent(activity, RegisterActivity::class.java)
            activity.startActivity(i)
        }

        fun goToHome() {
            val i = Intent(activity, HomeActivity::class.java)
            activity.startActivity(i)
            activity.finishAffinity()
        }
    }

    //REGISTER NAVIGATION
    inner class RegisterHelper {
        fun goToLogin() {
            activity.finish()
        }

        fun goToHome() {
            val i = Intent(activity, HomeActivity::class.java)
            activity.startActivity(i)
            activity.finishAffinity()
        }
    }

}