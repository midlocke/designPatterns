package com.example.pattern.decorator;

/**
 * Created by lichao on 2017/10/27.
 */
public class Test {
    public static void main(String[] args) {
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println("超优深焙咖啡，双份摩卡，打泡:" + beverage1.getDescription());
        System.out.println("cost:" + beverage1.cost() + "$");

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println("首选咖啡：" + beverage2.getDescription());
        System.out.println("cost : " + beverage2.cost() + "$");
    }
}
