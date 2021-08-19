package breakmethod;

import lanhanshi.demo3.Singleton;

import java.lang.reflect.Constructor;

/**
 * @Description: 反射破坏单例模式
 * @Author: Awei
 * @Create: 2021-08-19 15:20
 **/
public class Reflect {
    public static void main(String[] args) throws Exception {
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton = constructor.newInstance();
        System.out.println(singleton);
        Singleton singleton1 = constructor.newInstance();
        System.out.println(singleton == singleton1);
    }
}
