package com.example.pattern.strategy;

/**
 * Created by lichao on 2017/10/21.
 * 策略模式设计原则：
 * 面对接口编程，少用面对实现编程
 * 封装变化的部分
 * 多用组合，少用继承（解耦）
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("***********************Duck1 MallardDuck*********************");
        Duck duck1 = new MallardDuck();
        duck1.display();
        duck1.swim();
        duck1.fly();
        duck1.quack();
        System.out.println("***********************Duck1 ModelDuck*********************");
        Duck duck2 = new ModelDuck();
        duck2.display();
        duck2.swim();
        duck2.fly();
        duck2.quack();
        System.out.println("***********************修改ModelDuck的fly和quack后*********************");
        duck2.setFlyBehavior(new FlyRocketPower());
        duck2.setQuackBehavior(new Squeak());
        duck2.fly();
        duck2.quack();
    }
}
