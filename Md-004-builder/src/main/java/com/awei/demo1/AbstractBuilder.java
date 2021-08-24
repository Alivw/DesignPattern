package com.awei.demo1;

/**
 * @Description: 自行车构造类
 * @Author: shizuwei
 * @Create: 2021-08-24 08:58
 **/
public abstract class AbstractBuilder {
    /**
     * 生命自行车类
     * @param null
     * @return null
     * @Author: shizuwei 2021/8/24 9:53
     */
    protected Bike bike = new Bike();

    /**
     * 构建自行车车架
     * @param 
     * @return void
     * @Author: shizuwei 2021/8/24 9:53
     */
    public abstract void buildFrame();

    /**
     * 构建自行车座椅
     * @param 
     * @return void
     * @Author: shizuwei 2021/8/24 10:04
     */
    public abstract void buildSeat();

    /**
     * 生产自行车
     * @param
     * @return com.awei.demo1.Bike
     * @Author: shizuwei 2021/8/24 10:06
     */
    public abstract Bike createBike();
}
