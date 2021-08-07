package com.example.izden.data.prefs

import android.content.SharedPreferences
import com.google.gson.Gson
import javax.inject.Inject

class PrefsImpl @Inject constructor(private val gson: Gson,private val preferences: SharedPreferences) : Prefs {

    override fun isUserFirstTime(): Boolean {
        val isFirstTime = preferences.getBoolean("firstTime", true)

        if (isFirstTime){
            setNotFirstTime()
        }
        return isFirstTime
    }

    override fun setNotFirstTime() {
        val editor = preferences.edit()
        editor.putBoolean("firstTime", false)
        editor.putBoolean("auth", false)
        editor.putBoolean("loggedIn", false)
        editor.apply()
    }

    override fun isAuthorized(): Boolean {
        return preferences.getBoolean("auth", false)
    }

    override fun setAuthorized(isAuthorized: Boolean) {
        val editor = preferences.edit()
        editor.putBoolean("auth", isAuthorized)
        editor.apply()
    }

    override fun isLoggedIn(): Boolean {
        return preferences.getBoolean("loggedIn", false)
    }

    override fun login() {
        val editor = preferences.edit()
        editor.putBoolean("loggedIn", true)
    }

    override fun logout() {
        val editor = preferences.edit()
        editor.putBoolean("loggedIn", false)
    }


}