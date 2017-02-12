package decorator.starbuzzWithSizes;

/**
 * Created by lh on 17-2-12.
 */
public class Mocha extends CondimentDecorator{

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ",Mocha";
    }
}
