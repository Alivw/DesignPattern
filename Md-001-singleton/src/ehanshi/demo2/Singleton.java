package ehanshi.demo2;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-19 14:11
 **/
public class Singleton {

    private Singleton() {}
    
    private static Singleton instance ;
    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
