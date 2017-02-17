package factory.pizzafm;

/**
 * Created by lh on 17-2-14.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

    public ChicagoStyleCheesePizza() {

        name = "chicago style deep dish cheese pizza";
        dough = "extra thick crust dough";
        sauce = "plum tomato sauce";

        toppings.add("shredded mozzarella cheese");

    }

}
