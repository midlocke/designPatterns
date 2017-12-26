package com.example.pattern.strategy;

/**
 * Created by lichao on 2017/10/21.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyNoWay");
    }
}
