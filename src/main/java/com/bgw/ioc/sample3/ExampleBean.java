package com.bgw.ioc.sample3;

/**
 * ExampleBean
 *
 * @author zhibin.wang
 * @since 2019-11-24 21:50
 **/
public class ExampleBean {

    private AnotherBean beanOne;

    private YetAnotherBean beanTwo;

    private int i;

    public ExampleBean(AnotherBean beanOne, YetAnotherBean beanTwo, int i) {
        this.beanOne = beanOne;
        this.beanTwo = beanTwo;
        this.i = i;
    }

    @Override
    public String toString() {
        return "ExampleBean{" +
                "beanOne=" + beanOne +
                ", beanTwo=" + beanTwo +
                ", i=" + i +
                '}';
    }
}
