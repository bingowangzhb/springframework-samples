package com.bgw.spring.aop.proxy.cglib;

import com.bgw.spring.aop.common.HelloServiceImpl;
import org.springframework.cglib.core.NamingPolicy;
import org.springframework.cglib.core.Predicate;
import org.springframework.cglib.proxy.Enhancer;

/**
 * CglibTest
 *
 * @author bgw
 * @since 2020/8/15 18:29
 **/
public class CglibTest {

    public static void main(String[] args) {
        cglib1();
    }

    private static void cglib1() {
        // Enhancer实际属于CGLIB包的，也就是net.sf.cglib.proxy.Enhancer，Spring给搞到自己包里来管理了
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloServiceImpl.class);
        enhancer.setCallback(new MyMethodInterceptor());
        HelloServiceImpl helloService = (HelloServiceImpl) enhancer.create();
        helloService.sayHello("");
    }

    private static void cglib2() {
        Enhancer enhancer = new Enhancer();
    }
}
