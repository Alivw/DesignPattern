package com.awei;

/**
 * @version: v1.0
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-08-25 16:41
 **/
public class SDCardImpl implements SDCard {
    @Override
    public String readCd() {
        return "read msg from CDCard: 857857~";
    }

    @Override
    public void writeCd(String msg) {
        System.out.println("write msg into CDCard :" + msg);
    }
}
