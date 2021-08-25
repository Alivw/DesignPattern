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

    private TrainStation station = new TrainStation();
    public TrainStation getProxyObject() {
        // 创建 Enhancer 对象，类似于 JDK 代理中的 Proxy 类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象 代理对象 继承自目标类
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数    方法所属类的对象
        enhancer.setCallback(this);
        // 创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib动态代理雷肥");
        Object result = method.invoke(station, objects);
        return result;
    }

}
