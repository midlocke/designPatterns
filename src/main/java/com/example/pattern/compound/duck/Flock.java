package com.example.pattern.compound.duck;

import java.util.ArrayList;

/**
 * Created by lichao on 2017/12/22.
 */
public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Quackable quackable : quackers) {
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for(Quackable quackable : quackers){
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }
}
