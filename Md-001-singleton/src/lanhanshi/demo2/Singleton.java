package lanhanshi.demo2;

/**
 * @Description: 双重检查锁模式
 * @Author: Awei
 * @Create: 2021-08-19 14:29
 **/
public class Singleton {

    private Singleton() {
    }

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (null == instance) {
            // 为空 才要加锁
            synchronized (Singleton.class) {
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

