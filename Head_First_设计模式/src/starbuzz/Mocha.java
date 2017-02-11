package starbuzz;

/**
 * Created by lh on 17-2-10.
 */
public class Mocha  extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20+beverage.cost();
    }
}
