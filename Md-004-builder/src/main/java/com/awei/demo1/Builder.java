package com.awei.demo1;

/**
 * @Description: 自行车构造类
 * @Author: shizuwei
 * @Create: 2021-08-24 08:58
 **/
public abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
