package com.awei;

/**
 * @version: v1.0
 * @Description: Test class
 * @Author: shizuwei
 * @Create: 2021-08-25 16:49
 **/
public class Client {
    public static void main(String[] args) {
        Computer cpu = new Computer();
        System.out.println(cpu.readSD(new SDCardImpl()));

        System.out.println("========================");
        System.out.println(cpu.readSD(new SDAdapterTF()));

    }
}
