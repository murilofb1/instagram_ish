package com.example.instagramish.firebase

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth

class FirebaseAuthentication {
    companion object {
        private var auth: FirebaseAuth? = null
        private fun getFirebaseAuth(): FirebaseAuth {
            if (auth == null) {
                auth = FirebaseAuth.getInstance()
            }
            return auth!!
        }

        fun registerUser(email: String, psswd: String): Task<AuthResult> {
            return getFirebaseAuth().createUserWithEmailAndPassword(email, psswd)
        }

    }

}