package com.example.pattern.template;

/**
 * 模板方法模式：封装算法，定义一个算法骨架，具体实现交给子类完成
 * 模板方法模式和策略模式的区别：前者是封装的一个算法的骨架，采用的是继承的方式实现，后者是通过类的组合完成
 * 好莱坞原则：以高层组件调用底层组件
 */
public class BeverageTestDrive {

    public static void main(String[] args) {
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaWithHook.prepareRecipe();

        System.out.println("\nMaking Coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
