package com.awei.demo1;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-08-24 09:01
 **/
public class MobileBike extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮座椅");
    }


    @Override
    public Bike createBike(){
        return bike;
    }
}
