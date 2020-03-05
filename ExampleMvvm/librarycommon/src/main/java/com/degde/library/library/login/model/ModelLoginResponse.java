package com.degde.library.library.login.model;


import androidx.lifecycle.ViewModel;

import com.google.gson.annotations.SerializedName;

public class ModelLoginResponse extends ViewModel {

    @SerializedName("access_token")
    private String access_token;
    @SerializedName("expires_in")
    private int expires_in;
    @SerializedName("id_token")
    private String id_token;
    @SerializedName("refresh_token")
    private String refresh_token;
    @SerializedName("token_type")
    private String token_type;
    @SerializedName("expires_at")
    private String expires_at;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getId_token() {
        return id_token;
    }

    public void setId_token(String id_token) {
        this.id_token = id_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(String expires_at) {
        this.expires_at = expires_at;
    }
}