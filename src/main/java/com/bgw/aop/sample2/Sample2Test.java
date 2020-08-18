package com.bgw.aop.sample2;

import org.springframework.aop.framework.AopProxy;

/**
 * Sample2Test
 *
 * @author zhibin.wang
 * @since 2020/08/07 15:04
 */
public class Sample2Test {

    public static void main(String[] args) {
        // 保存生成的代理类的字节码文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        HelloService proxy = (HelloService) new HelloServiceDynamicProxy(new HelloServiceImpl()).getProxy();
        System.out.println(proxy.getClass());
        proxy.hello();


    }
}
