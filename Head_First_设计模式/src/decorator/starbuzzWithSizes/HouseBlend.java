package decorator.starbuzzWithSizes;

/**
 * Created by lh on 17-2-12.
 */
public class HouseBlend extends Beverage {
    public HouseBlend(Size size) {
        setSize(size);
        description = "House Bledn Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }

}
