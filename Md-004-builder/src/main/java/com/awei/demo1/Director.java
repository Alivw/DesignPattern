package com.awei.demo1;

/**
 * @Description: 指挥者类
 * @Author: shizuwei
 * @Create: 2021-08-24 09:03
 **/
public class Director {
    private final AbstractBuilder builder;

    /**
     * 构造方法
     * @Author: shizuwei 2021/8/24 10:04
     */
    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

   /**
    * 构造自行车
    * @return com.awei.demo1.Bike
    * @Author: shizuwei 2021/8/24 10:03
    */
    public Bike construct() {
        builder.buildSeat();
        builder.buildFrame();
        return builder.createBike();
    }
}
