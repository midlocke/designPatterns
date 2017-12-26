package com.example.pattern.state;

/**
 * Created by lichao on 2017/12/21.
 */
public class SoldOutState extends State {

    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
}
