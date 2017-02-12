package decorator.starbuzzWithSizes;

/**
 * Created by lh on 17-2-12.
 */
public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }


    @Override
    public double cost() {
        return .99;
    }
}
