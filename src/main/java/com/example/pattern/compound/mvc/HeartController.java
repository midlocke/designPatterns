package com.example.pattern.compound.mvc;

/**
 * Created by lichao on 2017/12/25.
 */
public class HeartController implements ControllerInterface {
    HeartModelInterface model;
    DJView view;
    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(this, new HeartAdapter(model)); //用适配器进行包装
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }
    public void start() {} //没有实际作用的我们留空
    public void stop() {}
    public void increaseBPM() {}
    public void decreaseBPM() {}
    public void setBPM(int bpm) {}
}
