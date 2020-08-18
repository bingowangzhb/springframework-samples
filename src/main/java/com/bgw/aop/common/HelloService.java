package com.bgw.aop.common;

/**
 * HelloService
 *
 * @author wang
 * @since 2020/8/15 17:39
 **/
public interface HelloService {
    /**
     * sayHello
     * @param name name
     */
    String sayHello(String name);

    /**
     * hashCode
     * @return int
     */
    @Override
    int hashCode();
}
