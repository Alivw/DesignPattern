package lanhanshi.demo3;

import java.io.Serializable;

/**
 * @Description: 静态内部类实现单例模式
 * @Author: Awei
 * @Create: 2021-08-19 14:35
 **/
public class Singleton implements Serializable {
    private Singleton() {

    }

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
