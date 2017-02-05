package adapter.ducks;

/**
 * Created by lh on 17-2-5.
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        this.quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck");
    }

}
