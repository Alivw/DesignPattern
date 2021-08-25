package com.awei.static_proxy;

/**
 * @version: v1.0
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-08-25 13:57
 **/
public class ProxyPoint implements SellTickets {
    /**
     * 火车站对象
     */
    TrainStation station = new TrainStation();

    @Override
    public void sell() {
        System.out.println("收取代理手续费");
        station.sell();
    }
}
