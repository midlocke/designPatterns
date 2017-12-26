package com.example.pattern.strategy;

/**
 * Created by lichao on 2017/10/21.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display(){
        System.out.println("MallardDuck display");
    }
}
