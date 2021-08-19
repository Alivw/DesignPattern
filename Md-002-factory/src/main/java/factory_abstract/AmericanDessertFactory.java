package factory_abstract;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-19 17:14
 **/
public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
