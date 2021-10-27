package com.wangzhb.spring.aop.common;

/**
 * HelloService
 *
 * @author wangzhb
 * @since 2020/8/15 17:39
 **/
public interface HelloService {
    /**
     * sayHello
     * @param name name
     * @return String
     */
    String sayHello(String name);

    /**
     * hashCode
     * @return int
     */
    @Override
    int hashCode();
}
