package factory_config;

public abstract class Coffee {
    public abstract String getName();

    public void addMilk() {
        System.out.println("add Milk");
    }

    public void addSuger() {
        System.out.println("add Suger");
    }
}
