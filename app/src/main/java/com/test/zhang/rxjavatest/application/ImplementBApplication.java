package com.test.zhang.rxjavatest.application;

import android.content.Context;
import android.content.res.Configuration;

import com.test.zhang.rxjavatest.Imple.implementAppBListener;

/**
 * Created by Chen_Zhang on 2017/12/18.
 */

public class ImplementBApplication extends ApplicationB implements implementAppBListener {
    @Override
    public void onOneCreateB() {
        super.onCreate();
    }

    @Override
    public void onOneAttachBaseContextB(Context base) {
        super.attachBaseContext(base);

    }

    @Override
    public void onOneConfigurationChangedB(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
