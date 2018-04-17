package com.demo.rpc.rmi.test;

import com.demo.rpc.rmi.server.Server;
import com.demo.rpc.rmi.service.impl.HelloServiceImpl;

/**
 * Created by xumiao on 4/17/18.
 */
public class RunServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8088,"helloService",new HelloServiceImpl());

        server.start();
    }
}
