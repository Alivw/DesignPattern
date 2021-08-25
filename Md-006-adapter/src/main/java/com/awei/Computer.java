package com.awei;

/**
 * @version: v1.0
 * @Description: 电脑类
 * @Author: shizuwei
 * @Create: 2021-08-25 16:45
 **/
public class Computer {

    public String readSD(SDCard sdCard) {
        return sdCard.readCd();
    }

    public void writeSD(SDCard sdCard,String msg) {
        sdCard.writeCd(msg);
    }
}
