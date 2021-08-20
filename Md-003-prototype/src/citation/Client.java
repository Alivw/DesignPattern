package citation;

/**
 * @Description: 测试类
 * @Author: Awei
 * @Create: 2021-08-20 16:19
 **/
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 = new Citation();
        Student stu = new Student();
        stu.setName("zhangsan");
        c1.setStu(stu);
//        c1.setName("zhangsan");
        Citation c2 = c1.clone();
//        c2.setName("lisi");
        c2.getStu().setName("lisi");
        c1.show();
        c2.show();
    }
}
