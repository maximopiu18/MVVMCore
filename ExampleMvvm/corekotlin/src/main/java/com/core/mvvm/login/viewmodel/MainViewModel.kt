package com.core.mvvm.login.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.core.mvvm.login.model.ModelLoginResponse
import com.core.mvvm.login.networking.LoginRepository


class MainViewModel : ViewModel() {
    private var loginRepository: LoginRepository? = null
    companion object {
        var mutableLiveData: MutableLiveData<ModelLoginResponse>? = null
    }

    fun initRequest() {
        if (mutableLiveData != null) {
            return
        }
        loginRepository = LoginRepository.getInstance()
        mutableLiveData = loginRepository!!.serviceRequest()
    }



    fun newsRepository() :  MutableLiveData<ModelLoginResponse>? {
        return mutableLiveData
    }


}



