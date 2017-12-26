package com.example.pattern.adapter.facade;

/**
 * Created by lichao on 2017/12/19.
 */
public class Projector {

    public void on(){
        System.out.println("projector is on!");
    }

    public void setInput(){
        System.out.println("projector has set input!");
    }

    public void wideScreenCode(){
        System.out.println("projector has set wide screen code!");
    }

    public void off(){
        System.out.println("projector is off!");
    }
}
