package simple_factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = CoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSuger();
        return coffee;
    }
}
