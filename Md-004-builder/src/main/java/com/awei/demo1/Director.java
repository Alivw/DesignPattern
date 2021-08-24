package com.awei.demo1;

/**
 * @Description: 指挥者类
 * @Author: shizuwei
 * @Create: 2021-08-24 09:03
 **/
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildSeat();
        builder.buildFrame();
        return builder.createBike();
    }
}
