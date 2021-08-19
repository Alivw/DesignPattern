package factory_config;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-19 18:28
 **/
public class CoffeeFactory {

    // 定义容器对象存储咖啡对象
    private static Map<String, Coffee> map = new HashMap<>();

    //加载配置文件，只需要加载一次
    static {
        try {
            InputStream in = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            Properties p = new Properties();
            p.load(in);
            //从p集合中获取全限定类名并创建对象
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = p.getProperty((String) key);
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                // 将对象放入容器中
                map.put((String) key, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String name) {
        return map.get(name);
    }

}
