package com.example.pattern.iterator;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by lichao on 2017/12/20.
 */
public class CafeMenu implements Menu{

    Hashtable<String,MenuItem> menuItems = new Hashtable<>();

    public CafeMenu(){
        menuItems.put("cafeMenu1",new MenuItem("cafeMenu1","cafeMenu1 description",false,2.1));
        menuItems.put("cafeMenu2",new MenuItem("cafeMenu2","cafeMenu2 description",false,2.2));
        menuItems.put("cafeMenu3",new MenuItem("cafeMenu3","cafeMenu3 description",false,2.3));
        menuItems.put("cafeMenu4",new MenuItem("cafeMenu4","cafeMenu4 description",false,2.4));
        menuItems.put("cafeMenu5",new MenuItem("cafeMenu5","cafeMenu5 description",true,2.5));
        menuItems.put("cafeMenu6",new MenuItem("cafeMenu6","cafeMenu6 description",true,2.6));
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
