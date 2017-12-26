package com.example.pattern.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by lichao on 2017/12/21.
 */
public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        try {
            GumballMachineRemote gumballMachineRemote = (GumballMachineRemote) Naming.lookup("rmi://127.0.0.1:1099/gumballMachine");
            GumballMonitor gumballMonitor = new GumballMonitor(gumballMachineRemote);
            gumballMonitor.report();
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
