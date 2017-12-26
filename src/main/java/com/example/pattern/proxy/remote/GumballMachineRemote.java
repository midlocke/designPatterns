package com.example.pattern.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by lichao on 2017/12/21.
 */
public interface GumballMachineRemote extends Remote {

    int getCount()throws RemoteException;
    String getLocation() throws RemoteException;
    String getState() throws RemoteException;
}
