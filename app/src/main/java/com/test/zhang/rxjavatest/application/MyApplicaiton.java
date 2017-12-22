package com.test.zhang.rxjavatest.application;

import android.content.Context;
import android.content.res.Configuration;

/**
 * Created by Chen_Zhang on 2017/12/18.
 */

public class MyApplicaiton extends ProxyApplication {
    @Override
    public void onCreate() {
        super.onCreate();
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
