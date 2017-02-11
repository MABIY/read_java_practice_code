package starbuzz;

/**
 * Created by lh on 17-2-11.
 */
public class Whip  extends CondimentDecorator{
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";
    }

    @Override
    public double cost() {
        return .10+beverage.cost();
    }
}
