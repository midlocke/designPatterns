package com.example.pattern.compound.mvc;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by lichao on 2017/12/25.
 */
public class HeartModel implements HeartModelInterface,Runnable {
    ArrayList beatObservers = new ArrayList();
    ArrayList bpmObservers = new ArrayList();
    int time = 1000;
    int bpm = 90;
    Random random = new Random(System.currentTimeMillis());
    Thread thread;

    public HeartModel(){
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run(){
        int lastrate = -1;
        for(;;){
            int change = random.nextInt();
            if(random.nextInt(2) == 0){
                change = 0 - change;
            }
            int rate = 60000/(time + change);
            if(rate < 120 && rate > 50){
                time += change;
                notifyBeatObservers();
                if(rate != lastrate){
                    lastrate = rate;
                    notifyBPMObservers();
                }
            }

            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int getHeartRate() {
        return 60000/time;
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(0);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        int i = beatObservers.indexOf(o);
        if(i>=0){
            beatObservers.remove(i);
        }
    }

    public void notifyBeatObservers(){
        for(int i = 0;i<beatObservers.size();i++){
            BeatObserver beatObserver = (BeatObserver)beatObservers.get(i);
            beatObserver.updateBeat();
        }
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        int i = bpmObservers.indexOf(o);
        bpmObservers.remove(i);
    }

    public void notifyBPMObservers(){
        for(int i = 0;i<bpmObservers.size();i++){
            BPMObserver bpmObserver = (BPMObserver)bpmObservers.get(i);
            bpmObserver.updateBPM();
        }
    }
}
