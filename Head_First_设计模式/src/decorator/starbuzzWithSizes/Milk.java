package decorator.starbuzzWithSizes;

/**
 * Created by lh on 17-2-12.
 */
public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
