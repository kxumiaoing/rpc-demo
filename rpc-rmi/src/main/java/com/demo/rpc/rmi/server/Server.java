package com.demo.rpc.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    private Integer port;
    private String serviceName;
    private Remote service;

    public Server(Integer port, String serviceName, Remote service) {
        this.port = port;
        this.serviceName = serviceName;
        this.service = service;
    }

    public void start() {
        Registry registry = null;

        try {
            registry = LocateRegistry.createRegistry(this.port);
            registry.rebind(this.serviceName,this.service);
//            Naming.bind(String.format("rmi://localhost:%d/%s",this.port,this.serviceName),this.service);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        System.out.println(this.serviceName + " service is waitting request...");
    }
}
