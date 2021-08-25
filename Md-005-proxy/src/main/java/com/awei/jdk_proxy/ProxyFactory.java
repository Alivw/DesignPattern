package com.awei.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @version: v1.0
 * @Description: 代理对象工厂类
 * @Author: shizuwei
 * @Create: 2021-08-25 14:14
 **/
public class ProxyFactory {
    // 声明目标类对象
    TrainStation station = new TrainStation();

    public SellTickets getProxyObject() {
        /**
         * ClassLoader loader ：类加载器，用于加载动态生成的代理类。可以通过目标对象获取类加载器
         * Class<?>[] interfaces ：代理类实现的接口的字节码对象
         * InvocationHandler h ：代理对象的调用处理程序
         */
        SellTickets sellTickets = ((SellTickets) Proxy.newProxyInstance(
                TrainStation.class.getClassLoader(),
                TrainStation.class.getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //System.out.println("Invoke 方法执行了");
                        // 做增强
                        System.out.println("代理点JDK勒肥");
                        // obj 即为代理方法 Sell（） 的返回值
                        Object obj = method.invoke(station, args);
                        return obj;
                    }
                }
        ));
        return sellTickets;
    }
}
