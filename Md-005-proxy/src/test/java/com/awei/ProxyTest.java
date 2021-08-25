package com.awei;

import static org.junit.Assert.assertTrue;

import com.awei.jdk_proxy.ProxyFactory;
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


    @Test
    public void jdkProxyTest() {
        new ProxyFactory().getProxyObject().sell();
    }

    @Test
    public void cglibProxyTest() {
        new com.awei.cglib_proxy.ProxyFactory().getProxyObject().sell();
    }
}
