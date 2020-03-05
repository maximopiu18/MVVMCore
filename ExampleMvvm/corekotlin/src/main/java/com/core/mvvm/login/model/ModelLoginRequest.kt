package com.core.mvvm.login.model

class ModelLoginRequest {
    private var identity_provider: String? = null
    private var username: String? = null
    private var password: String? = null

    fun getIdentity_provider(): String? {
        return identity_provider
    }

    fun setIdentity_provider(identity_provider: String?) {
        this.identity_provider = identity_provider
    }

    fun getUsername(): String? {
        return username
    }

    fun setUsername(username: String?) {
        this.username = username
    }

    fun getPassword(): String? {
        return password
    }

    fun setPassword(password: String?) {
        this.password = password
    }
}