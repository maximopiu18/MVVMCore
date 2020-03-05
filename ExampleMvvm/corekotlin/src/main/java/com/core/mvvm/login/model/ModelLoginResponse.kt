package com.core.mvvm.login.model

import com.google.gson.annotations.SerializedName

class ModelLoginResponse {
    @SerializedName("access_token")
    private var access_token: String? = null
    @SerializedName("expires_in")
    private var expires_in = 0
    @SerializedName("id_token")
    private var id_token: String? = null
    @SerializedName("refresh_token")
    private var refresh_token: String? = null
    @SerializedName("token_type")
    private var token_type: String? = null
    @SerializedName("expires_at")
    private var expires_at: String? = null

    fun getAccess_token(): String? {
        return access_token
    }

    fun setAccess_token(access_token: String?) {
        this.access_token = access_token
    }

    fun getExpires_in(): Int {
        return expires_in
    }

    fun setExpires_in(expires_in: Int) {
        this.expires_in = expires_in
    }

    fun getId_token(): String? {
        return id_token
    }

    fun setId_token(id_token: String?) {
        this.id_token = id_token
    }

    fun getRefresh_token(): String? {
        return refresh_token
    }

    fun setRefresh_token(refresh_token: String?) {
        this.refresh_token = refresh_token
    }

    fun getToken_type(): String? {
        return token_type
    }

    fun setToken_type(token_type: String?) {
        this.token_type = token_type
    }

    fun getExpires_at(): String? {
        return expires_at
    }

    fun setExpires_at(expires_at: String?) {
        this.expires_at = expires_at
    }
}
