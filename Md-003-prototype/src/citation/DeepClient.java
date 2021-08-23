package citation;

import java.io.*;

/**
 * @Description: 深克隆
 * @Author: Awei
 * @Create: 2021-08-23 13:52
 **/
public class DeepClient {
    public static void main(String[] args) throws Exception{
        Citation c1 = new Citation();
        Student stu = new Student();
        stu.setName("zhangsan");
        c1.setStu(stu);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Md-003-prototype/src/citation/citation.txt"));
        out.writeObject(c1);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Md-003-prototype/src/citation/citation.txt"));
        Citation c2 = ((Citation) in.readObject());
        c2.getStu().setName("lisi");
        c1.show();
        c2.show();
    }
}
