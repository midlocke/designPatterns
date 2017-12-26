package com.example.pattern.state;

/**
 * Created by lichao on 2017/12/21.
 */
public abstract class State {

    GumballMachine gumballMachine;

    public void insertQuarter(){
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter(){
        System.out.println("You can't eject the quarter!");
    }

    public void turnCrank(){
        System.out.println("Sorry! You can't turn the Crank!");
    }

    public void dispense(){
        System.out.println("No gumball dispensed!");
    }
}
