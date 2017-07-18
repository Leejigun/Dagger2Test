package com.example.dopy.testdagger2.model;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.example.dopy.testdagger2.MainActivity;
import dagger.Component;

/**
 * Created by Dopy on 2017-07-18.
 */
@Component(
        modules = {
        BikeModule.class
        }
)
public interface MainActivityComponent {
    void inject(@NonNull MainActivity mainActivity);
}