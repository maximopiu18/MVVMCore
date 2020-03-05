package com.degde.library.library.login.viewmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.degde.library.library.login.model.ModelLoginResponse;
import com.degde.library.library.login.networking.LoginRepository;


public class MainViewModel extends ViewModel {
    public static MutableLiveData<ModelLoginResponse> mutableLiveData;
    private LoginRepository loginRepository;


    public void initRequest(){
        if (mutableLiveData != null){
            return;
        }
        loginRepository = LoginRepository.getInstance();
        mutableLiveData = loginRepository.serviceRequest();

    }
    public MutableLiveData<ModelLoginResponse> getNewsRepository() {
        return mutableLiveData;
    }


}





