package com.example.dopy.testdagger2.model;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Dopy on 2017-07-18.
 */
@Module
public class MotorModule {
    @Provides
    Motor provideMotor() {
        Log.d("MotorModule", "provideMotor");
        return new Motor();
    }
}
