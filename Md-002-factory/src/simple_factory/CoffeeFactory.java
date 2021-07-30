package simple_factory;

public class CoffeeFactory {
    private Coffee coffee;

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public Coffee createCoffee(String type) {
        if ("LatteCoffee".equalsIgnoreCase(type)) {
            coffee = new LatteCoffe();
        } else if ("americanCoffee".equalsIgnoreCase(type)) {
            coffee = new AmericanCoffee();
        }else
            throw new RuntimeException("no this type Coffee");
        return coffee;
    }
}
