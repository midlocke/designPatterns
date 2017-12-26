package com.example.pattern.iterator.composite;

/**
 * 组合模式：将对象组合成树形结构来表现“整体/部分”层次结构
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakefase");
        MenuComponent dinerMenu = new Menu("DINER MENU","lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU","dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course");

        MenuComponent allMenus = new Menu("all Menus","All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("dinnerMenu1","dinnerMenu1 description",true,10.0));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("dessertMenu1","dessertMenu1 description",true,1.24));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }

}
