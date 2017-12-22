package com.test.zhang.rxjavatest.Imple;

import android.content.Context;
import android.content.res.Configuration;

/**
 * Created by Chen_Zhang on 2017/12/18.
 */

public interface implementAppListener {
    void onCreateC();

    void onAttachBaseContextC(Context base);

    void onConfigurationChangedC(Configuration newConfig);
}
