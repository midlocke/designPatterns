package com.example.pattern.decorator;

/**
 * Created by lichao on 2017/10/27.
 */
public class Mocha extends CondimentDerator{
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
