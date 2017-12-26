package com.example.pattern.adapter.facade;

/**
 * Created by lichao on 2017/12/19.
 */
public class Amplifier {

    void on(){
        System.out.println("Amplifier is on!");
    }

    void setVolume(){
        System.out.println("Amplifier volume is 10");
    }

    void setSurrondSound(){
        System.out.println("Amplifier has set surround sound");
    }

    void setDVD(String dvd){
        System.out.println("Amplifier has set dvd " + dvd);
    }

    void off(){
        System.out.println("Amplifier has off!");
    }
}
