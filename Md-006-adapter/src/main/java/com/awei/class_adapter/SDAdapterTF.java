package com.awei.class_adapter;

/**
 * @version: v1.0
 * @Description: SD--> TF 适配器
 * @Author: shizuwei
 * @Create: 2021-08-25 16:43
 **/
public class  SDAdapterTF  extends TFCardImpl implements SDCard {

    @Override
    public String readCd() {
        System.out.println("reading msg by adapter.....");
        return readTf();
    }

    @Override
    public void writeCd(String msg) {
        System.out.println("writing msg by adapter.....");
        writeTf(msg);
    }
}
