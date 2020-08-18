package com.bgw.aop.sample3;

import com.bgw.aop.common.HelloService;
import com.bgw.aop.common.HelloServiceImpl;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Sample3Main
 *
 * @author zhibin.wang
 * @since 2020/08/18 13:40
 */
public class Sample3Main {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ProxyFactory proxyFactory = new ProxyFactory(helloService);

        proxyFactory.addAdvice(new HelloServiceBeforeAdvice01());
        proxyFactory.addAdvice(new HelloServiceBeforeAdvice02());

        proxyFactory.addAdvice(new HelloServiceMethodInterceptor01());
        proxyFactory.addAdvice(new HelloServiceMethodInterceptor02());

        HelloService helloServiceProxy = (HelloService)proxyFactory.getProxy();

        helloServiceProxy.sayHello("Harden");
    }
}
