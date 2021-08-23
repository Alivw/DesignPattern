package com.awei.demo1;

/**
 * @Description: 执行者
 * @Author: shizuwei
 * @Create: 2021-08-23 16:22
 **/
public class Director {

    // 声明build 类型的变量
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装自行车功能
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
