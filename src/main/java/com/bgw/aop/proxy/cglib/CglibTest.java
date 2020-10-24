package com.bgw.aop.proxy.cglib;

import com.bgw.aop.common.HelloServiceImpl;
import org.springframework.cglib.proxy.Enhancer;

/**
 * CglibTest
 *
 * @author wang
 * @since 2020/8/15 18:29
 **/
public class CglibTest {

    public static void main(String[] args) {
        // Enhancer实际属于CGLIB包的，也就是net.sf.cglib.proxy.Enhancer，Spring给搞到自己包里来管理了
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloServiceImpl.class);
        enhancer.setCallback(new MyMethodInterceptor());

        HelloServiceImpl helloService = (HelloServiceImpl) enhancer.create();
        helloService.sayHello("");
    }
}
