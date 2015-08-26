package com.scratch.android;

import android.app.Application;
import android.content.Context;

public class ScratchApplication extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
        ScratchApplication.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return ScratchApplication.context;
    }
}
