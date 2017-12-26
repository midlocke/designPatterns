package com.example.pattern.compound.duck;

/**
 * Created by lichao on 2017/12/22.
 */
public class QuackCount implements Quackable {
    private Quackable quackable;
    private static int numbersOfQuack;

    QuackCount(Quackable quackable){
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numbersOfQuack++;
    }

    public static int getNumbersOfQuack(){
        return numbersOfQuack;
    }

    @Override
    public void registerObserver(Observer observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }
}
