package com.example.pattern.compound.duck;

import java.util.ArrayList;

/**
 * Created by lichao on 2017/12/22.
 */
public class Observable implements QuackObservable {
    private ArrayList<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck){
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(duck);
        }
    }
}
