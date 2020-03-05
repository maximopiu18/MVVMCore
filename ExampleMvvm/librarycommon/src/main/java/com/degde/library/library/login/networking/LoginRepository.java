package com.degde.library.library.login.networking;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;


import com.degde.library.library.apiservice.ApiServiceLogin;
import com.degde.library.library.login.model.ModelLoginRequest;
import com.degde.library.library.login.model.ModelLoginResponse;
import com.degde.library.library.utils.Utilerias;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginRepository {

    private static LoginRepository newsRepository;
    ModelLoginResponse modelLoginResponse;
    Context context;

    public static LoginRepository getInstance(){
        if (newsRepository == null){
            newsRepository = new LoginRepository();
        }
        return newsRepository;
    }

    private ApiServiceLogin newsApi;

    public LoginRepository(){
        newsApi = RetrofitService.getInstanceLogin().create(ApiServiceLogin.class);
    }


    public MutableLiveData<ModelLoginResponse> serviceRequest() {

        Log.e("EJECUTANDO", "EJECUTANDO SERVICIO REST");
        final Utilerias utilerias = new Utilerias();
        final MutableLiveData<ModelLoginResponse> mutableLiveData = new MutableLiveData<>();
        ModelLoginRequest modelrequest = new ModelLoginRequest();
        modelrequest.setIdentity_provider("cognito");
        modelrequest.setUsername("+525520868804");
        modelrequest.setPassword("MiPass1.0");

        Call<JsonObject> call = newsApi.getInstanceLogin(modelrequest);

        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {

                try {
                    Gson gson = new Gson();
                    modelLoginResponse= gson.fromJson(response.body(), ModelLoginResponse.class);
                    mutableLiveData.setValue(modelLoginResponse);
                }
                catch (Exception e)
                {
                    Log.e("error","error" + e);
                }

            }
            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Log.e("error", "error" + t);
            }
        });
        return mutableLiveData;

    }
}