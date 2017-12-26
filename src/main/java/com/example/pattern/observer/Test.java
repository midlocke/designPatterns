package com.example.pattern.observer;

/**
 * 设计原则：为交互对象的松耦合设计而努力
 * 注意：addObserver:添加观察者
 *      update:Observable更新数据时，Observer做出的反应
 *      notifyObserver：Observable数据发生改变时，通知所有Observer
 */
public class Test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForcastDisplay forcastDisplay = new ForcastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(23.0F,90.0F,0.3F);
    }
}
