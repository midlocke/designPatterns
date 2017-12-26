package com.example.pattern.strategy;

/**
 * Created by lichao on 2017/10/21.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("FlyWithWings");
    }
}
