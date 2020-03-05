package com.core.mvvm.login.networking

import com.core.mvvm.costants.Constantes
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
    private var retrofit: Retrofit? = null
    val getInstanceLogin: Retrofit?
        get() {
            if (retrofit == null) {
                retrofit = Retrofit.Builder().baseUrl(Constantes.URL_SERVER).addConverterFactory(GsonConverterFactory.create()).build()
            }
            return retrofit
        }
}