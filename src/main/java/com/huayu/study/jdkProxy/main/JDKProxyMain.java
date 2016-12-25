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
        JDKProxy jdkProxy = new JDKProxy();
        IUserService proxy = (IUserService) jdkProxy.createProxy(userService) ;
        proxy.add();
        proxy.sayHelloWorld();
    }




}
