package decorator.starbuzzWithSizes;

/**
 * Created by lh on 17-2-12.
 */
public abstract class CondimentDecorator  extends Beverage{
    protected Beverage beverage;

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public abstract String getDescription();

    @Override
    public double cost() {
        return 0;
    }
}
