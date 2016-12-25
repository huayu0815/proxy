package com.huayu.study.jdkProxy.demo;

/**
 * Created by zhaohuayu on 16/12/15.
 */
public class UserServiceImpl implements IUserService {

    public void add() {
        System.out.println("-------target add method-------");
    }

    public void sayHelloWorld() {
        System.out.println("------hello world!------");
    }
}
