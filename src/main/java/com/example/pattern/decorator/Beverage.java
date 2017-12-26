package com.example.pattern.decorator;

/**
 * Created by lichao on 2017/10/27.
 */
public abstract class Beverage {

    String description = "UnKnow Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
