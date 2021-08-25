package factory_method;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-19 16:38
 **/
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
//        CoffeeFactory factory = new AmericanCoffeeFactory();
        CoffeeFactory factory = new LatteCoffeeFactory();
        store.setFactory(factory);
        Coffee coffee = store.orderCoffee();
        coffee.addMilk();
        coffee.addSuger();
        System.out.println(coffee.getName());
    }
}
