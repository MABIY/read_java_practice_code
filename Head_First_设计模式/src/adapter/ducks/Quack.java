package adapter.ducks;

/**
 * Created by lh on 17-2-5.
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
