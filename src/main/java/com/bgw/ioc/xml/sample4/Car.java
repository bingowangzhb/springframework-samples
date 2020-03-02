package com.bgw.ioc.xml.sample4;

/**
 * Car
 *
 * @author zhibin.wang
 * @since 2019-12-05 20:09
 **/
public class Car {

    private String make;

    private int year;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", year=" + year +
                '}';
    }
}
