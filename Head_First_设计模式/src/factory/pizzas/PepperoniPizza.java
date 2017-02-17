package factory.pizzas;

/**
 * Created by lh on 17-2-14.
 */
public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated Parmesan cheese");
    }
}
