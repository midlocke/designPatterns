package com.example.pattern.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by lichao on 2017/12/21.
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {
        try {
            //启动RMI注册服务，指定端口为1099　（1099为默认端口）
            LocateRegistry.createRegistry(1099);
            //创建服务对象
            GumballMachineRemote gumballMachine = new GumballMachine("10.211.240.230",5);
            //把gumballMachine注册到RMI注册服务器上，命名为gumballMachine
            Naming.rebind("gumballMachine",gumballMachine);
        }catch (RemoteException | MalformedURLException e){
            e.printStackTrace();
        }
    }
}
