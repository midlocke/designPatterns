package com.example.pattern.strategy;

/**
 * Created by lichao on 2017/10/21.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squack");
    }
}
