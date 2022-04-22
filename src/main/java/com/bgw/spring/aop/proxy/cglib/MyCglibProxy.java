package com.bgw.spring.aop.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

/**
 * @author ambow
 * @since 2021/12/24 16:59
 */
public class MyCglibProxy implements MethodInterceptor {

    private final Object target;
    private final Enhancer enhancer;

    public MyCglibProxy(Object target, Enhancer enhancer, Class<?> intf) {
        this.target = target;
        this.enhancer = enhancer;
        this.enhancer.setCallback(this);
        this.enhancer.setSuperclass(intf);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        Object retVal = methodProxy.invokeSuper(o, args);

        return retVal;
    }
}
