package com.awei.class_adapter;

/**
 * @Description: TF卡类
 * @Author: shizuwei
 * @Create: 2021-08-25 16:39
 **/
public interface TFCard {
    String readTf();

    void writeTf(String msg);
}
