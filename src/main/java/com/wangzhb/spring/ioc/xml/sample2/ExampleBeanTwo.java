package com.wangzhb.spring.ioc.xml.sample2;

/**
 * ExampleBeanTwo
 *
 * @author zhibin.wangzhb
 * @since 2019-11-24 17:03
 **/
public class ExampleBeanTwo {

    private int year;

    private ExampleBeanOne exampleBeanOne;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ExampleBeanOne getExampleBeanOne() {
        return exampleBeanOne;
    }

    public void setExampleBeanOne(ExampleBeanOne exampleBeanOne) {
        this.exampleBeanOne = exampleBeanOne;
    }
}
