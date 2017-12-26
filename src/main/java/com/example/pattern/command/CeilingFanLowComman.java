package com.example.pattern.command;

/**
 * Created by lichao on 2017/12/18.
 */
public class CeilingFanLowComman implements Command {
    private CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanLowComman(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
        System.out.println("ceilingFan spedd is " + ceilingFan.getSpeed());
    }

    @Override
    public void undo() {
        ceilingFan.undo(prevSpeed);
    }
}
