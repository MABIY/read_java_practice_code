package factory.pizzas;

import java.util.ArrayList;

/**
 * Created by lh on 17-2-14.
 */
abstract public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing" +name);
    }

    public void bake() {
        System.out.println("Baking" + name);
    }

    public void cut() {
        System.out.println("Cutting " +name);
    }

    public void box() {
        System.out.println("Boxing " +name);
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("----" + name + "----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + '\n');
        }
        return display.toString();
    }
}
