package com.example.pattern.iterator;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by lichao on 2017/12/20.
 */
public class Waitress {
    ArrayList<Menu> menus;

    public Waitress(ArrayList menus){
        this.menus = menus;
    }

    void printMenus(){
        Iterator iterator = menus.iterator();
        while (iterator.hasNext()){
            Menu menu = (Menu)iterator.next();
            printMenus(menu.createIterator());
        }
    }

    private void printMenus(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + "," + menuItem.getDescription() + "," + menuItem.getPrice());
        }
    }
}
