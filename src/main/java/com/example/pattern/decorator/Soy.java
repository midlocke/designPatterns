package com.example.pattern.decorator;

/**
 * Created by lichao on 2017/10/27.
 */
public class Soy extends CondimentDerator{

    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }
}
