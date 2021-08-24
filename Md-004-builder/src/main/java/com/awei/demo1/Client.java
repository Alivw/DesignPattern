package com.awei.demo1;

/**
 * @Description: 客户端用户类
 * @Author: shizuwei
 * @Create: 2021-08-24 09:04
 **/
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new OffoBike());
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
