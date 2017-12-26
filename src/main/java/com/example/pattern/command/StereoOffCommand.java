package com.example.pattern.command;

/**
 * Created by lichao on 2017/12/18.
 */
public class StereoOffCommand implements Command {

    private Stereo stereo;
    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
