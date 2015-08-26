package com.scratch.android.auth;


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.scratch.android.ScratchApplication;

public class TokenService {
    private static final String JWT_KEY = "jwt";
    private static TokenService mInstance = null;
    private String token;

    private TokenService() {
        Context context = ScratchApplication.getAppContext();
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        this.token = settings.getString(JWT_KEY, null);
    }

    public static TokenService getInstance() {
        if (mInstance == null) {
            mInstance = new TokenService();
        }
        return mInstance;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;

        Context context = ScratchApplication.getAppContext();
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(JWT_KEY, token);
        editor.commit();
    }

    public void clearToken() {
        this.token = null;

        Context context = ScratchApplication.getAppContext();
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = settings.edit();
        editor.remove(JWT_KEY);
        editor.apply();
    }
}
