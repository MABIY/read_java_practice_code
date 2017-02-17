package factory.pizzaaf;

/**
 * Created by lh on 17-2-17.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSuce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }



    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {
                new BlackOlives(), new Spinach(), new Eggplant()
        };
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
