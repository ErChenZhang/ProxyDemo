package com.test.zhang.rxjavatest.application;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;

/**
 * Created by Chen_Zhang on 2017/12/18.
 * 需要继承的applicationB
 */

public class ApplicationB extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Log.d("Proxy", "onCreate: A被创建了");
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
