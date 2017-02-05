package adapter.design;

/**
 * Created by lh on 17-2-5.
 */
public class Queen extends Character{
    @Override
    public void fight() {
       weaponBehavior.useWeapon();
    }

    public Queen(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }
}
