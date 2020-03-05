package com.degde.library.library.login.model;

public class ModelLoginRequest {

    private String identity_provider;
    private String username;
    private String password;

    public String getIdentity_provider() {
        return identity_provider;
    }

    public void setIdentity_provider(String identity_provider) {
        this.identity_provider = identity_provider;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}