package com.example.mystudy.application;

import android.app.Application;

import com.hjq.toast.ToastUtils;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 在 Application 中初始化
        ToastUtils.init(this);
    }
}
