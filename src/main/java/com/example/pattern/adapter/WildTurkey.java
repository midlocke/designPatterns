package com.example.pattern.adapter;

/**
 * Created by lichao on 2017/12/19.
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobby gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
