package factory.pizzafm;

/**
 * Created by lh on 17-2-14.
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "Chicago Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Docugh";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

    /**
     * Cut.
     */
    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
