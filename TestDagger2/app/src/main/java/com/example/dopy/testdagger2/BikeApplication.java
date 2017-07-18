package com.example.dopy.testdagger2;

import android.app.Application;

import com.example.dopy.testdagger2.model.BikeModule;
import com.example.dopy.testdagger2.model.DaggerMainActivityComponent;
import com.example.dopy.testdagger2.model.MainActivityComponent;

/**
 * Created by Dopy on 2017-07-18.
 */

public class BikeApplication extends Application {

    private MainActivityComponent mainActivityComponent;
    static BikeApplication instance ;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        mainActivityComponent = DaggerMainActivityComponent.builder()
                .bikeModule(new BikeModule()).build();
    }
    public static BikeApplication getInstance(){
        return instance;
    }
    public MainActivityComponent getMainActivityComponent(){
        return mainActivityComponent;
    }
}
