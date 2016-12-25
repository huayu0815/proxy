package com.huayu.study.cglibProxy.demo;

/**
 * Created by zhaohuayu on 16/12/25.
 */
public class UserService {

    public void add() {
        System.out.println("-------target add method-------");
    }

    public void sayHelloWorld() {
        System.out.println("------hello world!------");
    }
}
