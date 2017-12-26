package com.example.pattern.iterator;

import java.util.ArrayList;

/**
 * 适配器模式：提供一种方法顺序访问聚合对象中的各个元素，而不暴露其内部的表示。
 * 设计原则：一个类应该只有一个引起变化的原因
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);
        Waitress waitress = new Waitress(menus);
        waitress.printMenus();
    }
}
