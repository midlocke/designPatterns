package com.example.pattern.command;

/**
 * Created by lichao on 2017/12/18.
 */
public class Light {

    private String description;

    public Light(String description){
        this.description = description;
    }

    public void on(){
        System.out.println(description + " was on !");
    }

    public void off(){
        System.out.println(description + " was off !");
    }
}
