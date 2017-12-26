package com.example.pattern.compound.mvc;

/**
 * Created by lichao on 2017/12/25.
 */
public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
