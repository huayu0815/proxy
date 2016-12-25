package com.huayu.study.cglibProxy.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zhaohuayu on 16/12/25.
 */
public class CglibProxy implements MethodInterceptor {

    private Object targetObject;

//    public CglibProxy(Object targetObject) {
//        super();
//        this.targetObject = targetObject;
//    }

    /**
     * 生成代理类
     * @param object
     * @return
     */
    public Object createProxyObject(Object object) {
        this.targetObject = object;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);
        Object proxyObj = enhancer.create();
        return  proxyObj ;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if ("sayHelloWorld".equals(method.getName())) {
            System.out.println("------before------");
            Object result = method.invoke(targetObject, objects) ;
            System.out.println("------after-------");
            return result;
        } else {
            Object result = method.invoke(targetObject, objects) ;
            return result;
        }
    }
}
