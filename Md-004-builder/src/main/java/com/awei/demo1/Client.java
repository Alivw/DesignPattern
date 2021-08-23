package com.awei.demo1;

/**
 * @Description: 客户端类
 * @Author: shizuwei
 * @Create: 2021-08-23 16:25
 **/
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MobileBuilder());
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
