package adapter.ducks;

/**
 * Created by lh on 17-2-5.
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
