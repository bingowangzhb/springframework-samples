package com.bgw.spring.aop.sample1;

import com.bgw.spring.aop.common.FooService;
import com.bgw.spring.aop.common.FooServiceImpl;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.AopUtils;
import org.springframework.core.DecoratingProxy;

import java.lang.reflect.Proxy;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // 用的很少
        AspectJProxyFactory aspectJProxyFactory = new AspectJProxyFactory();
        // 参数是具体类
        ProxyFactory proxyFactory = new ProxyFactory(new FooServiceImpl());
        proxyFactory.addInterface(FooService.class);
        // proxyFactory.addAdvice(new BeforeAdvice());

        proxyFactory.addAdvice((MethodBeforeAdvice) (method, arguments, target) -> {
            System.out.println("before");
        });
        //
        FooService proxy = (FooService) proxyFactory.getProxy();
        proxy.foo("zh", 18);

        // proxyFactory相关
        System.out.println("proxyFactory.getClass() = " + proxyFactory.getClass());
        // com.bgw.spring.aop.sample1.SimplePojo
        System.out.println("proxyFactory.getTargetClass() = " + proxyFactory.getTargetClass());
        // SingletonTargetSource for target object [com.bgw.spring.aop.sample1.SimplePojo@442d9b6e]
        System.out.println("proxyFactory.getTargetSource() = " + proxyFactory.getTargetSource());

        // [interface com.bgw.spring.aop.sample1.Pojo]
        System.out.println("Arrays.asList(proxyFactory.getProxiedInterfaces()) = " + Arrays.asList(proxyFactory.getProxiedInterfaces()));
        // [org.springframework.aop.support.DefaultPointcutAdvisor: pointcut [Pointcut.TRUE]; advice [com.bgw.spring.aop.sample1.Main$$Lambda$1/205797316@ee7d9f1]]
        System.out.println("Arrays.asList(proxyFactory.getAdvisors()) = " + Arrays.asList(proxyFactory.getAdvisors()));

        System.out.println("-------------------------------------------------");

        // class com.sun.proxy.$Proxy0
        System.out.println("proxy.getClass() = " + proxy.getClass());
        // true
        System.out.println("Proxy.isProxyClass(proxy.getClass()) = " + Proxy.isProxyClass(proxy.getClass()));
        // true
        System.out.println("AopUtils.isAopProxy(proxy) = " + AopUtils.isAopProxy(proxy));
        // true
        System.out.println("AopUtils.isJdkDynamicProxy(proxy) = " + AopUtils.isJdkDynamicProxy(proxy));
        // false
        System.out.println("AopUtils.isCglibProxy(proxy) = " + AopUtils.isCglibProxy(proxy));
        // Arrays.asList(proxy.getClass().getInterfaces()) = [
        // interface com.bgw.spring.aop.common.FooService,
        // interface org.springframework.aop.SpringProxy,
        // interface org.springframework.aop.framework.Advised,
        // interface org.springframework.core.DecoratingProxy]
        System.out.println("Arrays.asList(proxy.getClass().getInterfaces()) = " + Arrays.asList(proxy.getClass().getInterfaces()));
        System.out.println("\n");
        Advised advised = (Advised) proxy;
        System.out.println("advised.getProxiedInterfaces() = " + Arrays.asList(advised.getProxiedInterfaces()));
        System.out.println("advised.getTargetSource() = " + advised.getTargetSource());
        System.out.println("advised.getAdvisors() = " + Arrays.asList(advised.getAdvisors()));
        System.out.println("advised.isExposeProxy() = " + advised.isExposeProxy());
        System.out.println("advised.isFrozen() = " + advised.isFrozen());
        System.out.println();
        DecoratingProxy decoratingProxy = (DecoratingProxy) proxy;
        System.out.println("decoratingProxy.getDecoratedClass() = " + decoratingProxy.getDecoratedClass());

        System.out.println();
        // 所有Object的方法都不会被代理
        System.out.println(proxy.equals(new Object()));
        System.out.println(proxy.hashCode());
        System.out.println(proxy.getClass());
        // toString例外
        System.out.println(proxy.toString());

    }
}
