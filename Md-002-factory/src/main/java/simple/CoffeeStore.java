package simple;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if ("LatteCoffee".equalsIgnoreCase(type)) {
            coffee = new LatteCoffe();
        } else if ("americanCoffee".equalsIgnoreCase(type)) {
            coffee = new AmericanCoffee();
        }else
            throw new RuntimeException("no this type Coffee");
        return coffee;
    }
}
