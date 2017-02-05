package adapter.ducks;

/**
 * Created by lh on 17-2-5.
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
