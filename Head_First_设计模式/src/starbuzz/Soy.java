package starbuzz;

/**
 * Created by lh on 17-2-11.
 */
public class Soy extends CondimentDecorator{
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
