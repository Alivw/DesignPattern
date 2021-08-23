package com.awei.demo1;

/**
 * @Description: Offo自行车
 * @Author: shizuwei
 * @Create: 2021-08-23 16:21
 **/
public class OffoBike extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }

}
