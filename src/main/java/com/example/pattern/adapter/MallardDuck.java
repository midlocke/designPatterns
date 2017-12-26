package com.example.pattern.adapter;

/**
 * Created by lichao on 2017/12/19.
 */
public class MallardDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
