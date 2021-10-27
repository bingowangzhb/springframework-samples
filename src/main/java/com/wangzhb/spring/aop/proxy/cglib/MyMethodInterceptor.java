package com.wangzhb.spring.aop.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * MyMethodInterceptor
 * org.aopalliance.intercept包下也有一个
 *
 * @author wangzhb
 * @since 2020/8/15 18:25
 **/
public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object result = methodProxy.invokeSuper(o, args);
        System.out.println("after");
        return result;
    }


}
