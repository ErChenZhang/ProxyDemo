package com.test.zhang.rxjavatest.application;

import android.content.Context;
import android.content.res.Configuration;

import com.test.zhang.rxjavatest.Imple.implementAppAListener;

/**
 * Created by Chen_Zhang on 2017/12/18.
 */

public class ImplementAApplication extends ApplicationA implements implementAppAListener {
    @Override
    public void onOneCreateA() {
        super.onCreate();
    }

    @Override
    public void onOneAttachBaseContextA(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onOneConfigurationChangedA(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
