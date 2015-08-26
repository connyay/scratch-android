package com.scratch.android.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResult {

    @SerializedName("_id")
    @Expose
    private String Id;
    @Expose
    private String jwt;

    /**
     * @return The _id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id The _id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return The jwt
     */
    public String getJwt() {
        return jwt;
    }

    /**
     * @param jwt The jwt
     */
    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

}
