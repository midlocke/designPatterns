package com.example.pattern.adapter.facade;

/**
 * Created by lichao on 2017/12/19.
 */
public class HomeTheaterFacade {

    Amplifier amplifier;
    DVDPlayer dvdPlayer;
    Projector projector;
    TheaterLights theaterLights;
    PopcornPopper popcornPopper;
    Screen screen;

    public HomeTheaterFacade(Amplifier amplifier,
                             DVDPlayer dvdPlayer,
                             Projector projector,
                             Screen screen,
                             TheaterLights theaterLights,
                             PopcornPopper popcornPopper){
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie){
        System.out.println("start watch a movie..." + movie);
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim();
        screen.down();
        projector.on();
        projector.wideScreenCode();
        amplifier.on();
        amplifier.setDVD("taylor swift");
        amplifier.setVolume();
        dvdPlayer.on();
        dvdPlayer.play();
    }

    public void endMovie(){
        System.out.println("end a movie....");
        popcornPopper.off();
        theaterLights.on();
        screen.on();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.off();
    }
}
