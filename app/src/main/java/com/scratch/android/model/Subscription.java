package com.scratch.android.model;

import com.google.gson.annotations.Expose;


public class Subscription {

    @Expose
    private String plan;

    /**
     * @return The plan
     */
    public String getPlan() {
        return plan;
    }

    /**
     * @param plan The plan
     */
    public void setPlan(String plan) {
        this.plan = plan;
    }

}
