package com.example.pattern.proxy.remote;

import java.rmi.RemoteException;

/**
 * Created by lichao on 2017/12/21.
 */
public class GumballMonitor {

    GumballMachineRemote gumballMachineRemote;

    public GumballMonitor(GumballMachineRemote machineRemote){
        this.gumballMachineRemote = machineRemote;
    }

    public void report(){
        try{
            System.out.println("Gumball Machine:" + gumballMachineRemote.getLocation());
            System.out.println("Current inventory:" + gumballMachineRemote.getCount() + " gumballs");
            System.out.println("Current state:" + gumballMachineRemote.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
