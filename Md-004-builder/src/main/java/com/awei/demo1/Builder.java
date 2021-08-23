package com.awei.demo1;

/**
 * @Description: 抽象的构建者，用于构建自行车
 * @Author: shizuwei
 * @Create: 2021-08-23 16:13
 **/
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    /**
    * @Description: 构建自行车方法
    * @Param: 
    * @return: 
    * @Author: shizuwei
    * @Date: 2021/8/23
    */
    public abstract Bike createBike();
}
