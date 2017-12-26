package com.example.pattern.state;

/**
 * Created by lichao on 2017/12/21.
 */
public class NoQuarterState extends State {

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter(){
        System.out.println("You inserted a quarter!");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
}
