package com.bgw.aop.sample2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * HelloServiceDynamicProxy
 *
 * @author zhibin.wang
 * @since 2020/08/07 14:56
 */
public class HelloServiceDynamicProxy implements InvocationHandler {

    private final Object target;

    public HelloServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy.getClass() = " + proxy.getClass());
        System.out.println("-----------before------------");
        Object result = method.invoke(target, args);
        System.out.println("-----------after-------------");

        return result;
    }
}
