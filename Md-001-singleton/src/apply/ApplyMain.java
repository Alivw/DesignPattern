package apply;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description:  单例模式类的应用 JDK 中的 RunTime 类
 * @Author: Awei
 * @Create: 2021-08-19 16:11
 **/
public class ApplyMain {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("ipconfig");
        InputStream in = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        int len = in.read(arr);
        System.out.println(new String(arr, 0, len, "GBK"));
    }
}
