package com.example.dopy.testdagger2.model;

import android.util.Log;

/**
 * Created by Dopy on 2017-07-18.
 */

public class Motor {
    private int speed;

    public Motor() {
        Log.d("motor", "생성완료");
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int value) {
        speed = speed + value;
    }

    public void setSpeed(int value) {
        speed = value;
    }

    public void brake() {
        speed = 0;
    }
}
