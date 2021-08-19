package factory_simple;

public class CoffeeFactory {

    public static Coffee createCoffee(String type) {
        Coffee coffee;
        if ("LatteCoffee".equalsIgnoreCase(type)) {
            coffee = new LatteCoffe();
        } else if ("americanCoffee".equalsIgnoreCase(type)) {
            coffee = new AmericanCoffee();
        }else
            throw new RuntimeException("no this type Coffee");
        return coffee;
    }
}
