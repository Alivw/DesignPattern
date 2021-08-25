package com.awei.cglib_proxy;

import com.awei.jdk_proxy.SellTickets;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @version: v1.0
 * @Description: 代理对象工厂类
 * @Author: shizuwei
 * @Create: 2021-08-25 14:14
 **/
public class ProxyFactory implements MethodInterceptor {

    public TrainStation getProxyObject() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TrainStation.class);
        enhancer.setCallback(this);
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib动态代理雷肥");
        return null;
    }
}
