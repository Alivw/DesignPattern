package lanhanshi.demo3;

import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @Description: 静态内部类实现单例模式
 * @Author: Awei
 * @Create: 2021-08-19 14:35
 **/
public class Singleton implements Serializable {
    private static boolean flag = false;
    private Singleton() {
        /**
         * 反射破坏单例解决办法
         * 判断 是否第一次创建对象 如果不是第一次创建对象，则抛异常
         */
        if (flag) {
            throw new RuntimeException("不能创建多个对象");
        }
        flag = true;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 当 反序列化的时候，会自动调用该方法，将该方法的返回值直接返回
     * 反序列化破坏单例解决办法
     *
     * @return
     */
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
