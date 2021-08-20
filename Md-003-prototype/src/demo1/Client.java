package demo1;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-20 09:35
 **/
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建原型对象
        Realizetype realizetype = new Realizetype();
        // 调用 Realizetype 中的 clone 方法进行对象的克隆
        Realizetype clone = realizetype.clone();
        System.out.println(clone == realizetype);
    }
}
