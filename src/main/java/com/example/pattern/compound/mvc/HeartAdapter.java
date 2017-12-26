package com.example.pattern.compound.mvc;

/**
 * Created by lichao on 2017/12/25.
 */
public class HeartAdapter implements BeatModelInterface {
    HeartModelInterface heart;//适配器中要保留另一部分的引用
    public HeartAdapter(HeartModelInterface heart) {
        this.heart = heart;
    }
    public void initialize() {}//不需要的部分我们在适配器中留空。
    public void on() {}
    public void off() {}
    public int getBPM() {
        return heart.getHeartRate();//适配器在此处运转
    }
    public void setBPM(int bpm) {}
    public void registerObserver(BeatObserver o) {//将注册观察者Server的方法委托给heart
        heart.registerObserver(o);
    }
    public void removeObserver(BeatObserver o) {
        heart.removeObserver(o);
    }
    public void registerObserver(BPMObserver o) {
        heart.registerObserver(o);
    }
    public void removeObserver(BPMObserver o) {
        heart.removeObserver(o);
    }
}
