package com.example.izden

import androidx.lifecycle.MutableLiveData
import com.example.izden.core.BaseViewModel
import com.example.izden.data.prefs.Prefs
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val prefs: Prefs): BaseViewModel() {
    val isAuthorized = MutableLiveData(false)


    fun getIsAuthorized(){
        isAuthorized.postValue(prefs.isAuthorized())
    }
}