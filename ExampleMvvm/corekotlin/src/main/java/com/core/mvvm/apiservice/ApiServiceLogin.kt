package com.core.mvvm.apiservice

import com.core.mvvm.login.model.ModelLoginRequest
import com.google.gson.JsonObject

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiServiceLogin {
    @Headers("messageUUID: 1234567", "Content-Type: application/json")
    @POST("/dev/oauth2/token?grant_type=password")
    fun getInstanceLogin(@Body body: ModelLoginRequest?): Call<JsonObject?>?
}