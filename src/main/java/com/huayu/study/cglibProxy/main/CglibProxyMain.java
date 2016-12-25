package com.huayu.study.cglibProxy.main;

import com.huayu.study.cglibProxy.demo.UserService;
import com.huayu.study.cglibProxy.proxy.CglibProxy;

/**
 * Created by zhaohuayu on 16/12/25.
 */
public class CglibProxyMain {

    public static void main(String[] args) {
        UserService userService = new UserService();
        CglibProxy cglibProxy = new CglibProxy();
        UserService proxy = (UserService)cglibProxy.createProxyObject(userService) ;
        proxy.add();
        proxy.sayHelloWorld();
    }
}
