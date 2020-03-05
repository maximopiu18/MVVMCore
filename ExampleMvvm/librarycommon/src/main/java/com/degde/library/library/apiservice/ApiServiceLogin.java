package com.degde.library.library.apiservice;


import com.degde.library.library.login.model.ModelLoginRequest;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiServiceLogin {
    @Headers({
            "messageUUID: 1234567",
            "Content-Type: application/json"
    })

    @POST("/dev/oauth2/token?grant_type=password")
    Call<JsonObject> getInstanceLogin(@Body ModelLoginRequest body);

}