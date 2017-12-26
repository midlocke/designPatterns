package com.example.pattern.decorator;

/**
 * Created by lichao on 2017/10/27.
 */
public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "DarkRoast ";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
