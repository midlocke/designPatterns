package com.example.pattern.compound.duck;

/**
 * Created by lichao on 2017/12/22.
 */
public class GooseAdapter implements Quackable {
    private Observable observable;

    private Goose goose;

    public GooseAdapter(Goose goose){
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.hook();
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
