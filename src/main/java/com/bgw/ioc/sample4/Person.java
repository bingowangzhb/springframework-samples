package com.bgw.ioc.sample4;

/**
 * Person
 *
 * @author zhibin.wang
 * @since 2019-12-05 20:26
 **/
public class Person {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "car=" + car +
                '}';
    }
}
