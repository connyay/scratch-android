package com.scratch.android.model;


public class LoginRequest {
    final String email;
    final String password;

    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
