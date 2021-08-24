package com.awei.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version: v1.0
 * @Description: 自行车类
 * @Author: shizuwei
 * @Create: 2021-08-24 09:10
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bike {
    /**
     * 车架
     */
    private String frame;
    /**
     * 座椅
     */
    private String seat;
}

