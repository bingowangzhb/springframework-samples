package com.bgw.spi;

import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

/**
 * SpringFactoriesTest
 *
 * @author wang
 * @since 2020/9/26 18:47
 **/
public class SpringFactoriesTest {
    public static void main(String[] args) {

        List<HelloService> services = SpringFactoriesLoader.loadFactories(HelloService.class, SpringFactoriesTest.class.getClassLoader());
        services.forEach(s -> s.sayHello("james"));

        List<String> serviceNames = SpringFactoriesLoader.loadFactoryNames(HelloService.class, SpringFactoriesTest.class.getClassLoader());
        serviceNames.forEach(System.out::println);
    }
}
