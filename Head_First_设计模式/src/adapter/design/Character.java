package adapter.design;

/**
 * Created by lh on 17-2-5.
 */
public abstract class Character {
    WeaponBehavior weaponBehavior;

    public  void fight() {
        weaponBehavior.useWeapon();
    }

    public Character(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    protected void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
