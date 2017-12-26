package com.example.pattern.command;

/**
 * Created by lichao on 2017/12/18.
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF= 0;

    private int speed;
    private String description;

    public CeilingFan(String description){
        this.description = description;
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
    }

    public void medium(){
        speed = MEDIUM;
    }

    public void low(){
        speed = LOW;
    }

    public void off(){
        speed = OFF;
    }

    public int getSpeed(){
        return speed;
    }

    public void undo(int speed){
        if(speed == CeilingFan.HIGH){
            this.high();
        }else if(speed == CeilingFan.MEDIUM){
            this.medium();
        }else if(speed == CeilingFan.LOW){
            this.low();
        }else if(speed == CeilingFan.OFF){
            this.off();
        }
    }
}
