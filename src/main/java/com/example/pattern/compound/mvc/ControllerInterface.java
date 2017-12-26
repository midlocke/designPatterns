package com.example.pattern.compound.mvc;

/**
 * Created by lichao on 2017/12/25.
 */
public interface ControllerInterface {

    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
