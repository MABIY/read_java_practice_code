package decorator.starbuzzWithSizes;

import decorator.starbuzzWithSizes.Beverage.Size;
/**
 * Created by lh on 17-2-12.
 */
public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + String.format("%.2f",beverage.cost()));

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() +" $"+String.format("%.2f",beverage1.cost()));

        Beverage beverage2 = new HouseBlend(Size.GRANDE);
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()+" $" +String.format("%.2f"
        ,beverage2.cost()));

    }
}
