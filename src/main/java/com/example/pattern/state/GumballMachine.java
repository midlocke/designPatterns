package com.example.pattern.state;

/**
 * 采用双重检查锁的单例模式创建GumballMachine对象，以保证只拥有一个对象实例
 */
public class GumballMachine {
    private static GumballMachine ourInstance = null;

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;
    private int count = 0;

    private State state = soldOutState;

    public static GumballMachine getInstance(int numberGumballs) {
        if(ourInstance == null){
            synchronized(GumballMachine.class){
                ourInstance = new GumballMachine(numberGumballs);
            }
        }
        return ourInstance;
    }

    private GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if(numberGumballs > 0){
            state = noQuarterState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    void setState(State state){
        this.state = state;
    }

    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if(count != 0){
            count = count-1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState(){
        return winnerState;
    }
}
