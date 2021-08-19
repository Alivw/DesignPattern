package factory_config;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-19 18:37
 **/
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
        System.out.println(coffee.getName());
    }
}
