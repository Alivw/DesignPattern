package com.awei.demo1;

import lombok.*;

/**
 * @Description: 自行车类
 * @Author: shizuwei
 * @Create: 2021-08-23 16:10
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bike {
    private String frame;       // 车架
    private String seat;        // 车座
}
