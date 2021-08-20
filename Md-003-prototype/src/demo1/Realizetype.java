package demo1;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-20 09:14
 **/
public class Realizetype implements Cloneable {

    /**
    * @Description: 构造方法
    * @Param: []
    * @return: 
    * @Author: shizuwei
    * @Date: 2021/8/20
    */
    public Realizetype() {
        System.out.println("构造出具体的原型对象");
    }

    /**
     * @Description: 重写 Object 类中的 Clone 方法
     * @Param: []
     * @return: demo1.Realizetype
     * @Author: shizuwei
     * @Date: 2021/8/20
     */
    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型创建成功！");
        return (Realizetype) super.clone();
    }

}
