package com.awei.demo1;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-08-24 09:01
 **/
public class OffoBike extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("硬邦邦座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
