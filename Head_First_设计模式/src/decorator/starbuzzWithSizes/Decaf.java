package decorator.starbuzzWithSizes;

/**
 * Created by lh on 17-2-12.
 */
public class Decaf  extends Beverage{
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
