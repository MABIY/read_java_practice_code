package factory.pizzafm;

/**
 * Created by lh on 17-2-14.
 */
public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Regglano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }
}
