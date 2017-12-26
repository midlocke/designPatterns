package com.example.pattern.adapter.facade;

/**
 * 外观模式：提供一个统一的接口，用来访问子系统中的一群接口。
 * 设计原则：最少知识原则：只和你最近的对象进行交流。
 */
public class HomeTheaterTestDrive {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifier(),
                new DVDPlayer(),
                new Projector(),
                new Screen(),
                new TheaterLights(),
                new PopcornPopper());
        homeTheaterFacade.watchMovie("taylor swift");
        homeTheaterFacade.endMovie();
    }
}
