package com.example.pattern.factory;

/**
 * Created by lichao on 2017/12/12.
 */
public class PizzaTestDriver {

    /**
     * 工厂模式：定义一个创建对象的接口，由子类决定要实例化的类是哪一个，使类把实例化推迟到子类
     * 抽象工厂模式：提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类
     *
     * 依赖倒置的原则：
     * 变量不可以持有具体类的引用。
     * 不要让类派生自具体类。
     * 不要覆盖基类中已实现的方法。
     *
     * 简单工厂：用一个工厂类封装new对象，返回新建对象的引用。
     * 静态工厂：使用静态方法创建对象
     *
     * 工厂模式和抽象工厂模式的区别：
     * 工厂模式是有创建具体类的方法，只不过把过程推迟到子类中实现。
     * 抽象工厂模式是创建相关或依赖对象的家族，而不是所需要的具体类
     */
    public static void main(String[] args) {
        PizzaStore NYPizzaStore = new NYStylePizzaStore();
        NYPizzaStore.orderPizza("cheese");

        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
        chicagoPizzaStore.orderPizza("veggie");
    }
}
