package com.example.pattern.decorator;

/**
 * Created by lichao on 2017/10/27.
 */
public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "HouseBlend ";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
