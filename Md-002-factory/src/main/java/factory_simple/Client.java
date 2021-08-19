package factory_simple;

public class Client {

    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latteCoffee");
        System.out.println(coffee.getName());
    }
}
