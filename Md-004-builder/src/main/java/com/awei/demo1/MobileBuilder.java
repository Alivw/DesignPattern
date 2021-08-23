package com.awei.demo1;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-08-23 16:19
 **/
public class MobileBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }

}
