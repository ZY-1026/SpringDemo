package com.spring.ioc.interfaces;

public class OneInterfaceImpl implements OneInterface{

    public void say(String msg) {
        System.out.println("ServiceImpl say: " + msg);
    }
}
