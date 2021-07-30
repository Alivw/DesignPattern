package simple_factory;

public class Client {

    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("americanCoffee");
        System.out.println(coffee.getName());
    }
}
