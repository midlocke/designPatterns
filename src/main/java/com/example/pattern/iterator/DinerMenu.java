package com.example.pattern.iterator;


import java.util.Iterator;

/**
 * Created by lichao on 2017/12/20.
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        menuItems[0] = new MenuItem("DinerMenu1", "DinerDes1", false, 1);
        menuItems[1] = new MenuItem("DinerMenu2", "DinerDes2", false, 2);
        menuItems[2] = new MenuItem("DinerMenu3", "DinerDes3", false, 3);
        menuItems[3] = new MenuItem("DinerMenu4", "DinerDes4", false, 4);
        menuItems[4] = new MenuItem("DinerMenu5", "DinerDes5", true, 5);
        menuItems[5] = new MenuItem("DinerMenu6", "DinerDes6", true, 6);
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
