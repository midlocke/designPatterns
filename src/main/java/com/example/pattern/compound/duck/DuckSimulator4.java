package com.example.pattern.compound.duck;

/**
 * 通过抽象工厂的方法创建对象，以防止漏掉统计叫声
 */
public class DuckSimulator4 {

    public static void main(String[] args) {
        DuckSimulator4 duckSimulator4 = new DuckSimulator4();
        AbstractDuckFactory abstractDuckFactory = new CountingDuckFactory();
        duckSimulator4.simulate(abstractDuckFactory);
    }

    private void simulate(AbstractDuckFactory abstractDuckFactory){
        Quackable mallardDuck = abstractDuckFactory.createMallardDuck();
        Quackable redheadDuck = abstractDuckFactory.createRedheadDuck();
        Quackable duckCall = abstractDuckFactory.createDuckCall();
        Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
        Quackable gooseAdapter = new GooseAdapter(new Goose());

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
