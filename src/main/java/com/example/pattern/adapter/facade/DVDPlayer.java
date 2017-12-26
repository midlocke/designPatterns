package com.example.pattern.adapter.facade;

/**
 * Created by lichao on 2017/12/19.
 */
public class DVDPlayer {

    public void on(){
        System.out.println("dvd player is on!");
    }

    public void play(){
        System.out.println("dvd player is playing!");
    }

    public void stop(){
        System.out.println("dvd player has stopped!");
    }

    public void off(){
        System.out.println("dvd player is off!");
    }
}
