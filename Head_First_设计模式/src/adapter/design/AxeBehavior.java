package adapter.design;

/**
 * Created by lh on 17-2-5.
 */
public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("实现用斧头砍劈");
    }
}
