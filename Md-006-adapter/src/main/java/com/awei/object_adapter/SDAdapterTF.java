package com.awei.object_adapter;

/**
 * @version: v1.0
 * @Description: SD--> TF 适配器
 * @Author: shizuwei
 * @Create: 2021-08-25 16:43
 **/
public class  SDAdapterTF   implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }
    @Override
    public String readCd() {
        System.out.println("reading msg by adapter.....");
        return tfCard.readTf();
    }

    @Override
    public void writeCd(String msg) {
        System.out.println("writing msg by adapter.....");
        tfCard.writeTf(msg);
    }
}
