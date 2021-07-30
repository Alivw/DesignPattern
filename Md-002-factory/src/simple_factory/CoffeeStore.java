package simple_factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        CoffeeFactory factory = new CoffeeFactory();
        Coffee coffee = factory.createCoffee(type);
        coffee.addMilk();
        coffee.addSuger();
        return coffee;
    }
}
