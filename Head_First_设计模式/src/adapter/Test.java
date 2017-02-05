package adapter;

import adapter.design.Character;
import adapter.design.SwordBehavior;
import adapter.design.WeaponBehavior;

/**
 * Created by lh on 17-2-5.
 */
public class Test extends Character {
    public Test(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }


    public void mm(WeaponBehavior weaponBehavior) {
        setWeaponBehavior(weaponBehavior);
    }
}
class M {
    public static void main(String[] args) {
        Test test = new Test(new SwordBehavior());
        test.mm(new SwordBehavior() );
        test.fight();
    }
}
