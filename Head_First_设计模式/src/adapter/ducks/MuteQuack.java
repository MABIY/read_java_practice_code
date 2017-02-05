package adapter.ducks;

/**
 * Created by lh on 17-2-5.
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
