package com.example.pattern.compound.duck;

/**
 * Created by lichao on 2017/12/22.
 */
public class MallardDuck implements Quackable {
    private Observable observable;

    public MallardDuck(){
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("MallardDuck quack!");
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
