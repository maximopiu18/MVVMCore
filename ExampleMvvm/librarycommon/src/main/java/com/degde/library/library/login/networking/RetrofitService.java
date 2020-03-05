package com.degde.library.library.login.networking;

import com.degde.library.library.constants.Constantes;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {
    private static Retrofit retrofit;

    public static Retrofit getInstanceLogin() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(Constantes.URL_SERVER).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

}