package com.example.pattern.decorator;

/**
 * Created by lichao on 2017/10/27.
 */
public class Expresso extends Beverage{

    public Expresso(){
        description = "Expresso ";
    }

    @Override
    public double cost() {
        return 1.08;
    }
}
