package com.example.pattern.factory;

/**
 * Created by lichao on 2017/12/12.
 */
public class Pizza {

    String name;
    String dough;
    String sauce;
    String toppings;

    void bake(){
        System.out.println("bake " + name + ","  + "," + dough + "," + sauce);
    }

    void cut(){
        System.out.println("cut " + name + ","  + "," + dough + "," + sauce);
    }

    void box(){
        System.out.println("box " + name + ","  + "," + dough + "," + sauce);
    }

    public String getName(){
        return name;
    }
}
