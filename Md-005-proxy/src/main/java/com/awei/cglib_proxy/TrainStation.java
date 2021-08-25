package com.awei.cglib_proxy;

import com.awei.jdk_proxy.SellTickets;

/**
 * @version: v1.0
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-08-25 13:57
 **/
public class TrainStation  {

    static int args = 1;

    public void sell() {
        System.out.println("火车站卖票");
    }

    public static Integer doSome() {
        System.out.println("火车站副业，跑黑车");
        return (args++);
    }





}
