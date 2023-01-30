package com.example.padsous.util

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth

class AuthentificationViewModel() : ViewModel() {

    private val firebaseAuth = FirebaseAuth.getInstance()

    private val _authentificationState = MutableLiveData<AuthenticationState>()
    val authenticationState: LiveData<AuthenticationState>
        get() = _authentificationState

    fun register(email: String, password: String, context: Context, navigateToHomePage: () -> Unit) {
        firebaseAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    _authentificationState.value = AuthenticationState.AUTHENTICATED
                    Toast.makeText(
                        context,
                        "Compte créé !",
                        Toast.LENGTH_SHORT
                    ).show()
                    navigateToHomePage()
                } else {
                    _authentificationState.value = AuthenticationState.UNAUTHENTICATED
                }
            }
    }

    fun login(email: String, password: String, context: Context, navigateToLoginPage: () -> Unit) {
        firebaseAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    _authentificationState.value = AuthenticationState.AUTHENTICATED
                    Toast.makeText(
                        context,
                        "Vous êtes connecté !",
                        Toast.LENGTH_SHORT
                    ).show()
                    navigateToLoginPage()
                } else {
                    _authentificationState.value = AuthenticationState.UNAUTHENTICATED
                    Toast.makeText(
                        context,
                        "Mot de passe ou email incorrect. Veuillez réessayez de vous connecter",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        navigateToLoginPage()
    }
}