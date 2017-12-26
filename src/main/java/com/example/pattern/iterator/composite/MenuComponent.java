package com.example.pattern.iterator.composite;

import java.util.Iterator;

/**
 * Created by lichao on 2017/12/20.
 */
public abstract class MenuComponent {

    public void print(){
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

}
