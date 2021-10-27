package com.wangzhb.spring.aop.proxy.jdk;

import com.wangzhb.spring.aop.common.HelloService;
import com.wangzhb.spring.aop.common.HelloServiceImpl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * JdkProxyTest
 *
 * @author wangzhb
 * @since 2020/8/15 17:43
 **/
public class JdkProxyTest {

    public static void main(String[] args) throws Exception {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // proxy1();
        // proxy2();
        // proxy3();
        // proxy = Proxy + 实现类 + InvocationHandler

        //proxy4();
    }

    private static void proxy2() {
        HelloService helloService = new HelloServiceImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(helloService);
        HelloService proxy = (HelloService) Proxy.newProxyInstance(JdkProxyTest.class.getClassLoader(), helloService.getClass().getInterfaces(), myInvocationHandler);
        proxy.sayHello("");

        // []
        System.out.println("HelloService.class.getInterfaces() = " + Arrays.toString(HelloService.class.getInterfaces()));
        // [interface com.bgw.spring.aop.common.HelloService]
        System.out.println("HelloServiceImpl.class.getInterfaces() = " + Arrays.toString(HelloServiceImpl.class.getInterfaces()));
        // [interface com.bgw.spring.aop.common.HelloService]
        System.out.println("helloService.getClass().getInterfaces() = " + Arrays.toString(helloService.getClass().getInterfaces()));


    }

    private static void proxy1() {
        // jdk动态代理三要素， 接口，实现，代理类
        // 目标实现
        HelloService helloService = new HelloServiceImpl();

        // 代理
        MyInvocationHandler invocationHandler = new MyInvocationHandler(helloService);
        // 转换
        HelloService proxy = (HelloService) invocationHandler.getProxy();
        // proxy.sayHello();

        System.out.println("proxy.hashCode() = " + proxy.hashCode());
        System.out.println("proxy.hashCode() = " + proxy.toString());
        System.out.println("proxy.hashCode() = " + proxy.equals("1"));
    }

    private static void proxy3() throws Exception {
        // 1. 生成代理接口的Class
        Class<?> proxyClass = Proxy.getProxyClass(JdkProxyTest.class.getClassLoader(), HelloService.class);
        // proxyClass = class com.sun.proxy.$Proxy0
        System.out.println("proxyClass = " + proxyClass);

        // 2. 获取构造器
        Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
        // public com.sun.proxy.$Proxy0(java.lang.reflect.InvocationHandler)
        System.out.println("constructor = " + constructor);
        // 3. new InvocationHandler
        InvocationHandler ih = new MyInvocationHandler(new HelloServiceImpl());
        HelloService helloService = (HelloService) constructor.newInstance(ih);
        helloService.sayHello("");

    }

    private static void proxy4() throws Exception {

        PureInterfaceInvocationHandler invocationHandler = new PureInterfaceInvocationHandler(HelloService.class);
        // 转换
        HelloService proxy = (HelloService) invocationHandler.getProxy();

        System.out.println("proxy.sayHello(\"abc\") = " + proxy.sayHello("abc"));

    }

}
