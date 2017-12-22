package com.test.zhang.rxjavatest.application;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.test.zhang.rxjavatest.Imple.implementAppListener;

/**
 * Created by Chen_Zhang on 2017/12/18.
 */

public class ImplementApplication extends Application implements implementAppListener {
    ImplementAApplication alistener = null;
    ImplementBApplication blistener = null;


    @Override
    public void onCreateC() {
        super.onCreate();
        if (alistener != null){
            alistener.onOneCreateA();
        }
        if (blistener != null){
            blistener.onOneCreateB();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onAttachBaseContextC(Context base) {
        super.attachBaseContext(base);

        alistener = initAlistener();
        blistener = initBlistener();
        if (alistener != null){
            alistener.onOneAttachBaseContextA(base);
        }
        if (blistener != null){
            blistener.onOneAttachBaseContextB(base);
        }

    }

    @Override
    public void onConfigurationChangedC(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (alistener != null){
            alistener.onConfigurationChanged(newConfig);
        }
        if (blistener != null){
            blistener.onConfigurationChanged(newConfig);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private ImplementAApplication initAlistener() {
        //反射的方式初始化ImplementAApplication
            try {
                Class clazz = Class.forName("com.test.zhang.rxjavatest.Imple.implementAppAListener");
                return (ImplementAApplication) clazz.newInstance();
            } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
                e.printStackTrace();
            }
            return null;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private ImplementBApplication initBlistener() {
        //反射的方式初始化ImplementAApplication
        try {
            Class clazz = Class.forName("com.test.zhang.rxjavatest.Imple.implementAppBListener");
            return (ImplementBApplication) clazz.newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
