package starbuzz;

/**
 * Created by lh on 17-2-10.
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
