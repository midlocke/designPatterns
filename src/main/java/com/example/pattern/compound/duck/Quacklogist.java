package com.example.pattern.compound.duck;

/**
 * Created by lichao on 2017/12/22.
 */
public class Quacklogist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quacklogist:" + duck + " just quacked!");
    }
}
