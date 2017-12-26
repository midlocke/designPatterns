package com.example.pattern.strategy;

/**
 * Created by lichao on 2017/10/21.
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("MuteQuack mutequack");
    }
}
