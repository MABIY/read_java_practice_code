package decorator.starbuzzWithSizes;

/**
 * Created by lh on 17-2-12.
 */
public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    public double cost() {
        return beverage.cost() + .10;
    }
}
