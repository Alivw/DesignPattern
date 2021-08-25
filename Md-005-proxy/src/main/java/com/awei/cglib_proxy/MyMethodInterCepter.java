package com.awei.cglib_proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @version: v1.0
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-08-25 15:13
 **/
public class MyMethodInterCepter implements MethodInterceptor {

    private TrainStation trainStation = new TrainStation();

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("被MyMethodInterCepter雷肥！");
        return method.invoke(trainStation, objects);
    }
}
