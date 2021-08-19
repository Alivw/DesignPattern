package ehanshi.demo1;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-19 14:07
 **/
public class Singleton {
    private Singleton() {
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

}
