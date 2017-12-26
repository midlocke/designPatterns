package com.example.pattern.command;

/**
 * Created by lichao on 2017/12/18.
 */
public class Stereo {

    private String cd;

    public void setCd(String cd){
        this.cd = cd;
    }

    public void on(){
        System.out.println("stereo is on ,cd is " + cd);
    }

    public void off(){
        System.out.println("stereo is off");
    }
}
