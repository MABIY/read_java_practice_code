package adapter.design;

/**
 * Created by lh on 17-2-5.
 */
public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("用弓箭从射击");
    }
}
