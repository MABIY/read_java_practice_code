package adapter.design;

/**
 * Created by lh on 17-2-5.
 */
public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("实现用宝剑挥舞");
    }
}
