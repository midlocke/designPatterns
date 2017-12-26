package com.example.pattern.state;

/**
 * Created by lichao on 2017/12/21.
 */
public class WinnerState extends State {

    public WinnerState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void dispense(){
        System.out.println("You are a Winner! You will get two gumballs!");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else {
            gumballMachine.releaseBall();
            if(gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else {
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
