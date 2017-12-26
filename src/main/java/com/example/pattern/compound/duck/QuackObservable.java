package com.example.pattern.compound.duck;

/**
 * Created by lichao on 2017/12/22.
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
