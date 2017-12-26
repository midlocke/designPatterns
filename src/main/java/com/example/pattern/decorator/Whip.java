package com.example.pattern.decorator;

/**
 * Created by lichao on 2017/10/27.
 */
public class Whip extends CondimentDerator{

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Whip";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.12;
    }
}
