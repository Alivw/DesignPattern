package com.awei.static_proxy;

/**
 * @version: v1.0
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-08-25 13:57
 **/
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
