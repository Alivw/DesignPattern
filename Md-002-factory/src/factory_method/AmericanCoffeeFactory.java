package factory_method;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-19 16:35
 **/
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {

        return new AmericanCoffee();
    }
}
