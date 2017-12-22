package com.test.zhang.rxjavatest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Chen_Zhang on 2017/12/18.
 */

public class Mainactivoty extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "灭什么", Toast.LENGTH_SHORT).show();
    }
}
