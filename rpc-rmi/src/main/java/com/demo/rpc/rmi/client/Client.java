package com.demo.rpc.rmi.client;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by xumiao on 4/17/18.
 */
public class Client {
    public static Remote getService(Integer port,String serviceName) {
        Remote service = null;
        Registry registry = null;

        try {
            registry = LocateRegistry.getRegistry(port);
            service = registry.lookup(serviceName);
//            service = Naming.lookup(String.format("rmi://localhost:%d/%s",port,serviceName));
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }

        return service;
    }
}
