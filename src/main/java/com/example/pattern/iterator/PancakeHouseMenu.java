package com.example.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by lichao on 2017/12/20.
 */
public class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public PancakeHouseMenu(){
        menuItems.add(new MenuItem("pancakeHouse menu1","description1",false,1.1));
        menuItems.add(new MenuItem("pancakeHouse menu2","description2",false,1.2));
        menuItems.add(new MenuItem("pancakeHouse menu3","description3",false,1.3));
        menuItems.add(new MenuItem("pancakeHouse menu4","description4",false,1.4));
        menuItems.add(new MenuItem("pancakeHouse menu5","description5",true,1.5));
        menuItems.add(new MenuItem("pancakeHouse menu6","description6",true,1.6));
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
