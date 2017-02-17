package factory.pizzaaf;

/**
 * Created by lh on 17-2-16.
 */
public abstract class PizzaStore {
    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("---Making a " + pizza + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
