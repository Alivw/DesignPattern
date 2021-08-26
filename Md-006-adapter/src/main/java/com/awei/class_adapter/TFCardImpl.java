package com.awei.class_adapter;

/**
 * @version: v1.0
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-08-25 16:39
 **/
public class TFCardImpl implements TFCard {
    @Override
    public String readTf() {
        return "read msg from Tfcard: Hello World!";
    }

    @Override
    public void writeTf(String msg) {
        System.out.println("write msg into Tfcard:"+msg);
    }
}
