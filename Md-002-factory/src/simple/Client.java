package simple;

public class Client {
    /**
     *
     */

    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("LatteCoffee");
        coffee.addMilk();
        coffee.addSuger();
        System.out.println(coffee.getName());
    }
}
