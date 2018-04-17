package com.demo.rpc.rmi.test;

import com.demo.rpc.rmi.client.Client;
import com.demo.rpc.rmi.service.HelloService;

/**
 * Created by xumiao on 4/17/18.
 */
public class RunClient {
    public static void main(String[] args) throws Exception{
        HelloService service = (HelloService) Client.getService(8088,"helloService");

        System.out.println(service.sayHello("world"));
    }
}
