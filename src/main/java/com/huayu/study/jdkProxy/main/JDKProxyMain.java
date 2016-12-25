package com.huayu.study.jdkProxy.main;


import com.huayu.study.jdkProxy.demo.IUserService;
import com.huayu.study.jdkProxy.demo.UserServiceImpl;
import com.huayu.study.jdkProxy.proxy.JDKProxy;

import java.lang.reflect.Proxy;

/**
 * Created by zhaohuayu on 16/12/15.
 */
public class JDKProxyMain {

    public static void main(String[] args) {
        IUserService userService = new UserServiceImpl();

        JDKProxy jdkProxy = new JDKProxy(userService) ;

        IUserService proxy = (IUserService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), userService.getClass().getInterfaces(), jdkProxy) ;

        proxy.add();

        proxy.sayHelloWorld();
    }




}
