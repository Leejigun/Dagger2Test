package com.example.dopy.testdagger2.model;

import android.util.Log;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Dopy on 2017-07-18.
 */

@Module(
        includes = MotorModule.class
)
public class BikeModule {
    @Provides
    Bike provideBike(Motor motor) {
        Log.d("BikeModule","provideBike");
        return new Bike(motor);
    }
}
