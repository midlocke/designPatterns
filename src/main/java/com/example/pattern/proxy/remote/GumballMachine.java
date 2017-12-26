package com.example.pattern.proxy.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by lichao on 2017/12/21.
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private String location;
    private int count;

    public GumballMachine(String location,int count) throws RemoteException{
        this.count = count;
        this.location = location;
    }

    @Override
    public int getCount() throws RemoteException {
        return count;
    }

    @Override
    public String getLocation() throws RemoteException {
        return location;
    }

    @Override
    public String getState() throws RemoteException {
        return "state";
    }
}
