package com.example.pattern.compound.duck;

/**
 * 通过装饰器模式，统计呱呱叫声的次数
 */
public class DuckSimulator3 {

    public static void main(String[] args) {
        DuckSimulator3 duckSimulator3 = new DuckSimulator3();
        duckSimulator3.simulate();
    }

    private void simulate(){
        Quackable mallardDuck = new QuackCount(new MallardDuck());
        Quackable redheadDuck = new QuackCount(new RedheadDuck());
        Quackable duckCall = new QuackCount(new DuckCall());
        Quackable rubberDuck = new QuackCount(new RubberDuck());
        Goose goose = new Goose();
        Quackable gooseAdapter = new GooseAdapter(goose);

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapter);

        System.out.println("\nquacked times:" + QuackCount.getNumbersOfQuack());
    }

    private void simulate(Quackable quackable){
        quackable.quack();
    }
}
