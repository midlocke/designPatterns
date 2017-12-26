package com.example.pattern.iterator.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by lichao on 2017/12/20.
 */
public class Menu extends MenuComponent{

    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name,String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void print(){
        System.out.print("\n" + getName());
        System.out.print(", " + getDescription());
        System.out.println("-----------------------");
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    public Iterator createIterator(){
        return new CompositeIterator(menuComponents.iterator());
    }
}
