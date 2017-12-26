package com.example.pattern.iterator.composite;

import com.example.pattern.chenqing.composite.NullIterator;

import java.util.Iterator;

/**
 * Created by lichao on 2017/12/20.
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }

    public void print(){
        System.out.print(" " + getName());
        if(isVegetarian()){
            System.out.print("(V)");
        }
        System.out.println(", " + getPrice());
        System.out.println(", " + getDescription());
    }

    public Iterator createIterator(){
        return new NullIterator();
    }
}
