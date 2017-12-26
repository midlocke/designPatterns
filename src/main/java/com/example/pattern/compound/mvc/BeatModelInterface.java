package com.example.pattern.compound.mvc;

/**
 * Created by lichao on 2017/12/25.
 */
public interface BeatModelInterface {

    void initialize();
    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();
    void registerObserver(BeatObserver o);//有两种观察者，一种观察者希望每个节拍都被通知，另一种观察者希望BPM改变时被通知
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);

}
