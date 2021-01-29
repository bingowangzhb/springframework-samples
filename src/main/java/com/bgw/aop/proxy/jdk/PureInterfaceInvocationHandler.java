package com.bgw.aop.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * PureInterfaceInvocationHandler
 *
 * @author zhibin.wang
 * @since 2021/01/25 14:43
 */
public class PureInterfaceInvocationHandler implements InvocationHandler {

    private Class<?> interfaces;

    public PureInterfaceInvocationHandler(Class<?> interfaces) {
        this.interfaces = interfaces;
    }


    public Object getProxy() {
        return Proxy.newProxyInstance(interfaces.getClassLoader(), new Class[]{interfaces}, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // System.out.println("proxy = " + proxy);
        System.out.println("method = " + method);
        System.out.println("args = " + Arrays.toString(args));



        return "abc";
    }
}
