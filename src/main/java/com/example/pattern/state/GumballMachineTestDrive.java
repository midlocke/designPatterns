package com.example.pattern.state;

/**
 * 状态模式：允许对象在内部改变时改变它的行为，对象看起来好像修改了它的类
 * 状态模式和策略模式的区别：用途不一样，前者是context自动转换对象，进而转换行为，后者是主动修改对应的对象进而转换行为方式
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = GumballMachine.getInstance(10);

        System.out.println("installed gumballMachine!");

        System.out.println("----------------1--------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("----------------2--------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("----------------3--------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("----------------4--------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("----------------5--------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("----------------6--------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("----------------7--------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("----------------8--------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("----------------9--------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("----------------10--------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

    }
}
