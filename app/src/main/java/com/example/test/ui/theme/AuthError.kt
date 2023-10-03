package com.example.test.ui.theme

sealed class AuthError(message: String) {
    class UnknownError(msg: String) : AuthError(msg)
    object LoginError : AuthError("wrong login")
    object PasswordError : AuthError("wrong password")
}