package com.example.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by lichao on 2017/10/26.
 */
public class ForcastDisplay implements Observer,DisplayElement{

    private Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public ForcastDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forcast Condition is :  temperature--" + temperature + " degree" +
                " pressure--" + pressure + " humidity--" + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
