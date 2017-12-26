package com.example.pattern.compound.duck;

/**
 * Created by lichao on 2017/12/22.
 */
public class RedheadDuck implements Quackable {
    private Observable observable;

    public RedheadDuck(){
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("RedheadDuck quack!");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
