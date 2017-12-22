package com.test.zhang.rxjavatest.application;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import com.test.zhang.rxjavatest.Imple.implementAppListener;

/**
 * Created by Chen_Zhang on 2017/12/18.
 * 代理类 想要继承两个application 直接可以继承代理类
 * 代理类中反射找到implementApplication
 */

public class ProxyApplication extends Application {
    implementAppListener applicationlistener = null;

    @Override
    public void onCreate() {
        super.onCreate();
        if (applicationlistener != null){
            applicationlistener.onCreateC();
        }
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        applicationlistener = initApplication();
        if (applicationlistener != null){
            applicationlistener.onAttachBaseContextC(base);
        }

    }

    private implementAppListener initApplication() {
        try {
            Class clazz = Class.forName("com.test.zhang.rxjavatest.Imple.implementAppListener");
            try {
                return (implementAppListener) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (applicationlistener != null){
            applicationlistener.onConfigurationChangedC(newConfig);
        }
    }
}
