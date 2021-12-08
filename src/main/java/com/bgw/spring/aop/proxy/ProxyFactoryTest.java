package com.bgw.spring.aop.proxy;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.AopUtils;

/**
 * @author ambow
 * @since 2021/12/3 16:42
 */
public class ProxyFactoryTest {

    @Test
    public void testJdkProxy () {
        ProxyFactory proxyFactory = new ProxyFactory();
        HiServiceImpl serviceImpl = new HiServiceImpl();
        proxyFactory.setInterfaces(Hi.class);
        proxyFactory.setTarget(serviceImpl);
        Object proxy = proxyFactory.getProxy();

        Hi hi = (Hi)proxy;
        hi.hi("james");

        printProxy(proxy);
    }

    @Test
    public void testCglibProxy() {
        ProxyFactory proxyFactory = new ProxyFactory();
        HiServiceImpl serviceImpl = new HiServiceImpl();
        proxyFactory.setInterfaces(Hi.class);
        proxyFactory.setTarget(serviceImpl);
        proxyFactory.setProxyTargetClass(true);
        proxyFactory.setTargetClass(serviceImpl.getClass());
        Object proxy = proxyFactory.getProxy();
        Hi hi = (Hi)proxy;
        hi.hi("james");
        printProxy(proxy);
    }



    private void printProxy(Object proxy) {
        //System.out.println("proxy = " + proxy);
        System.out.println("AopUtils.isJdkDynamicProxy(proxy) = " + AopUtils.isJdkDynamicProxy(proxy));
        System.out.println("AopUtils.isCglibProxy(proxy) = " + AopUtils.isCglibProxy(proxy));
        System.out.println("AopUtils.isAopProxy(proxy) = " + AopUtils.isAopProxy(proxy));
    }
}

interface Hi {
    /**
     * hi
     * @param name name
     */
    void hi(String name);
}

class HiServiceImpl implements Hi {
    @Override
    public void hi(String name) {
        System.out.println("hi, " + name);
    }
}


