package lanhanshi.demo1;

/**
 * @Description: 懒汉式，在首次使用该对象的时候创建
 * 线程安全模式 ： 加上 synchronized
 * @Author: Awei
 * @Create: 2021-08-19 14:19
 **/
public class Singleton {

    private Singleton () {

    }

    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (null == instance) {
            instance = new Singleton();
        }
        return instance;
    }
}
