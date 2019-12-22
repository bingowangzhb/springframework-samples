package com.bgw.ioc.sample4;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.util.StringUtils;

/**
 * Car
 *
 * @author zhibin.wang
 * @since 2019-12-05 20:05
 **/
public class CarFactory implements FactoryBean<Car> {

    private String make;

    private int year;

    @Override
    public Car getObject() throws Exception {

        Car car = CarBuilder.car();
        if (year != 0) {
            car.setYear(this.year);
        }
        if (StringUtils.hasText(this.make)) {
            car.setMake(this.make);
        }

        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }


    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "CarFactory{" +
                "make='" + make + '\'' +
                ", year=" + year +
                '}';
    }
}
