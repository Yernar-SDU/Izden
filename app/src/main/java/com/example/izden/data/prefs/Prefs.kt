package com.example.izden.data.prefs

interface Prefs {

    fun isUserFirstTime(): Boolean
    fun setNotFirstTime()

    fun isAuthorized(): Boolean
    fun setAuthorized(isAuthorized: Boolean)

    fun isLoggedIn(): Boolean
    fun login()
    fun logout()
}