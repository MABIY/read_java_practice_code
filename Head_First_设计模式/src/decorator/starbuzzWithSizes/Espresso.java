package decorator.starbuzzWithSizes;

/**
 * Created by lh on 17-2-12.
 */
public class Espresso extends Beverage{
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
