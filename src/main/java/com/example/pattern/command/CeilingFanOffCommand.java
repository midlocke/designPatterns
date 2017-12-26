package com.example.pattern.command;

/**
 * Created by lichao on 2017/12/18.
 */
public class CeilingFanOffCommand implements Command {

    private CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
        System.out.println("ceilingFan spedd is " + ceilingFan.getSpeed());
    }

    @Override
    public void undo() {
        ceilingFan.undo(prevSpeed);
        System.out.println("ceilingFan spedd is " + ceilingFan.getSpeed());
    }
}
