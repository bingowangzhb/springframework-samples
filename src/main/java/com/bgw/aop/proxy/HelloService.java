package com.bgw.aop.proxy;

/**
 * HelloService
 *
 * @author wang
 * @since 2020/8/15 17:39
 **/
public interface HelloService {
    /**
     * sayHello
     */
    void sayHello();

    /**
     * hashCode
     * @return int
     */
    @Override
    int hashCode();
}
