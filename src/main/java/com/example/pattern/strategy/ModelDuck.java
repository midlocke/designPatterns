package com.example.pattern.strategy;

/**
 * Created by lichao on 2017/10/21.
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("ModelDuck display");
    }
}
