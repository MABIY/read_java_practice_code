package decorator.starbuzz;

/**
 * Created by lh on 17-2-10.
 */
public class Espresso extends Beverage{

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
