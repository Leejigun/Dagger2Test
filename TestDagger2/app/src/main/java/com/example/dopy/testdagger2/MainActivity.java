package com.example.dopy.testdagger2;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.dopy.testdagger2.model.Bike;
import com.example.dopy.testdagger2.model.BikeModule;
import com.example.dopy.testdagger2.model.DaggerMainActivityComponent;
import com.example.dopy.testdagger2.model.MainActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity{
    @Inject
    Bike bike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","준비");
        MainActivityComponent mainActivityComponent= DaggerMainActivityComponent.builder()
                .bikeModule(new BikeModule()).build();;
        mainActivityComponent.inject(MainActivity.this);
        //BikeApplication.getInstance().getMainActivityComponent().inject(MainActivity.this);
        bike.bang();
    }
}
