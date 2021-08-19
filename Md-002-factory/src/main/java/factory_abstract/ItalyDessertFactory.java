package factory_abstract;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-19 17:15
 **/
public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffe();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
