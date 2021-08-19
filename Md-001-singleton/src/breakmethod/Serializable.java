package breakmethod;

import lanhanshi.demo3.Singleton;

import java.io.*;

/**
 * @Description: 序列化 反序列化 破坏单例
 * @Author: Awei
 * @Create: 2021-08-19 15:03
 **/
public class Serializable {

    public static void main(String[] args) throws Exception {
        wirteObject2File();
        readObjectFromFile();
    }

    private static void readObjectFromFile() throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Md-001-singleton/src/breakmethod/a.txt"));
        Singleton singleton = (Singleton) in.readObject();
        System.out.println(singleton);
        in.close();
    }

    private static void wirteObject2File() throws IOException {
        Singleton s = Singleton.getInstance();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Md-001-singleton/src/breakmethod/a.txt"));
        out.writeObject(s);
        System.out.println(s);
        out.close();
    }
}
