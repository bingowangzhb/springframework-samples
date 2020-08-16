package com.bgw.aop.sample1;

import org.springframework.aop.framework.ProxyFactory;

public class Main {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new SimplePojo());
        proxyFactory.addInterface(Pojo.class);
        proxyFactory.addAdvice(new MyMethodInterceptor());
        proxyFactory.addAdvice(new MyMethodInterceptor());
        Pojo proxy = (Pojo)proxyFactory.getProxy();
        proxy.foo("hello", 24);
    }
}
