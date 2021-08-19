package factory_abstract;

/**
 * @Description: 测试类
 * @Author: Awei
 * @Create: 2021-08-19 17:16
 **/
public class Client {
    public static void main(String[] args) {
        ItalyDessertFactory factory = new ItalyDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
