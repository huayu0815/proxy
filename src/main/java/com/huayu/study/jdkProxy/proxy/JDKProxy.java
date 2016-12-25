package com.huayu.study.jdkProxy.proxy;

import com.huayu.study.jdkProxy.demo.IUserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zhaohuayu on 16/12/15.
 */
public class JDKProxy implements InvocationHandler {

    private Object target;

//    public JDKProxy(Object target) {
//        super();
//        this.target = target;
//    }

    /**
     * 创建代理对象
     * @param object
     * @return
     */
    public Object createProxy(Object object) {
        this.target = object ;
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this) ;
    }

    /**
     * 执行目标对象的方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if ("sayHelloWorld".equals(method.getName())) {
            System.out.println("------before------");
            Object result = method.invoke(target, args) ;
            System.out.println("------after-------");
            return result;

        } else {
            Object result = method.invoke(target, args) ;
            return result;

        }

    }



}
