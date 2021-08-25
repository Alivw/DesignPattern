package com.awei;

import static org.junit.Assert.assertTrue;

import com.awei.static_proxy.ProxyPoint;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ProxyTest
{

    /**
     * 静态代理测试方法
     * @param
     * @return void
     * @Author: shizuwei 2021/8/25 14:01
     */
    @Test
    public void staticProxyTest() {
        ProxyPoint point = new ProxyPoint();
        point.sell();
    }
}
