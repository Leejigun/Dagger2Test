package com.example.dopy.testdagger2.model;

import android.support.annotation.NonNull;
import android.util.Log;

/**
 * Created by Dopy on 2017-07-18.
 */

public class Bike {
    private Motor motor;

    public Bike(@NonNull Motor motor) {
        Log.d("Bike", "생성 완료");
        this.motor = motor;
    }

    public void increaseSpped() {
        this.motor.setSpeed(this.motor.getSpeed() + 1);
    }

    public void decreaseSpeed() {
        if (this.motor.getSpeed() > 0) {
            this.motor.setSpeed(this.motor.getSpeed() - 1);
        }
    }

    public void bang(){
        Log.d("Bike", "빵빵");
    }

    public int getSpeed() {
        return this.motor.getSpeed();
    }
}
