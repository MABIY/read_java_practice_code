package adapter.design;

/**
 * Created by lh on 17-2-5.
 */
public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("用匕首刺杀");
    }
}
