package com.example.pattern.compound.duck;

/**
 * 通过适配器模式，加入鹅的种类
 */
public class DuckSimulator2 {

    public static void main(String[] args) {
        DuckSimulator2 duckSimulator2 = new DuckSimulator2();
        duckSimulator2.simulate();
    }

    private void simulate(){
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Goose goose = new Goose();
        Quackable gooseAdapter = new GooseAdapter(goose);

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapter);
    }

    private void simulate(Quackable quackable){
        quackable.quack();
    }
}
