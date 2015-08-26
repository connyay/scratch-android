package com.scratch.android.api;


import com.scratch.android.auth.TokenService;
import com.scratch.android.model.ItemResult;
import com.scratch.android.model.LoginRequest;
import com.scratch.android.model.LoginResult;
import com.scratch.android.model.MeResult;

import java.util.List;

import retrofit.Callback;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

public class ApiClient {
    private static ScratchApiService sScratchApiService;
    private static TokenService sTokenService;


    public static ScratchApiService getsScratchApiService() {
        if (sScratchApiService == null) {
            sTokenService = TokenService.getInstance();
            RequestInterceptor requestInterceptor = new RequestInterceptor() {
                @Override
                public void intercept(RequestFacade request) {
                    String jwt = sTokenService.getToken();
                    if (jwt != null) {
                        request.addHeader("Authorization", "JWT ".concat(jwt));
                    }
                }
            };

            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint("https://beta.tryscratch.com")
                    .setLogLevel(RestAdapter.LogLevel.BASIC)
                    .setRequestInterceptor(requestInterceptor)
                    .build();

            sScratchApiService = restAdapter.create(ScratchApiService.class);
        }

        return sScratchApiService;
    }

    public interface ScratchApiService {
        @POST("/auth/login")
        void login(@Body LoginRequest body, Callback<LoginResult> callback);

        @GET("/api/me")
        void me(Callback<MeResult> callback);

        @GET("/api/items")
        void collectionItems(@Query("conditions") String conditions, Callback<List<ItemResult>> callback);
    }
}
