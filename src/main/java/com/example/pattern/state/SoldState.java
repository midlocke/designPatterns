package com.example.pattern.state;

/**
 * Created by lichao on 2017/12/21.
 */
public class SoldState extends State {

    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void dispense(){
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else {
            System.out.println("out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
