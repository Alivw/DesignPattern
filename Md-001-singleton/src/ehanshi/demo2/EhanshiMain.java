package ehanshi.demo2;


/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-19 14:08
 **/
public class EhanshiMain {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
