package com.awei.demo2;

/**
 * @version: v1.0
 * @Description: 客户端类
 * @Author: shizuwei
 * @Create: 2021-08-24 11:01
 **/
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .memory("金士顿内存")
                .screen("三星屏幕")
                .mainboard("华硕主板")
                .build();

        System.out.println(phone);
    }
}
