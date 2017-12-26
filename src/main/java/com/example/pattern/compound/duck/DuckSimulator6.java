package com.example.pattern.compound.duck;

/**
 * Created by lichao on 2017/12/22.
 */
public class DuckSimulator6 {

    public static void main(String[] args) {
        DuckSimulator6 duckSimulator6 = new DuckSimulator6();
        AbstractDuckFactory abstractDuckFactory = new CountingDuckFactory();
        duckSimulator6.simulate(abstractDuckFactory);
    }

    private void simulate(AbstractDuckFactory abstractDuckFactory){
        Quackable mallardDuck = abstractDuckFactory.createMallardDuck();
        Quackable redheadDuck = abstractDuckFactory.createRedheadDuck();
        Quackable duckCall = abstractDuckFactory.createDuckCall();
        Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
        Quackable gooseAdapter = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseAdapter);

        Flock flockOfMallards = new Flock();

        for(int i=0;i<4;i++){
            flockOfMallards.add(abstractDuckFactory.createMallardDuck());
        }

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator:Whole Flock Simulation");
        Quacklogist quacklogist = new Quacklogist();
        flockOfDucks.registerObserver(quacklogist);
        simulate(flockOfDucks);

        System.out.println("\nquacked times:" + QuackCount.getNumbersOfQuack());
        simulate(flockOfMallards);

        System.out.println("\nquacked times:" + QuackCount.getNumbersOfQuack());
    }

    private void simulate(Quackable quackable){
        quackable.quack();
    }
}
