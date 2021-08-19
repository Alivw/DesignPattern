package lanhanshi.demo2;

import ehanshi.demo2.Singleton;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-19 14:31
 **/
public class DbClockMain {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
