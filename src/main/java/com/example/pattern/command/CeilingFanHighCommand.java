package com.example.pattern.command;

/**
 * Created by lichao on 2017/12/18.
 */
public class CeilingFanHighCommand implements Command {

    private CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
        System.out.println("ceilingFan spedd is " + ceilingFan.getSpeed());
    }

    @Override
    public void undo() {
        ceilingFan.undo(prevSpeed);
    }
}
