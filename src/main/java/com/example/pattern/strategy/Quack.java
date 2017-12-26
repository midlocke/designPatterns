package com.example.pattern.strategy;

/**
 * Created by lichao on 2017/10/21.
 */
public class Quack implements QuackBehavior {

    public void quack(){
        System.out.println("Quack quack");
    }
}
