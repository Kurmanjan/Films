package com.example.androidlesson2callbacksretrofit;

import android.app.Application;

import com.example.androidlesson2callbacksretrofit.data.GhibliService;

public class App extends Application {
    public static GhibliService ghibliService;

    @Override
    public void onCreate() {
        super.onCreate();
        ghibliService = new GhibliService();
    }
}
