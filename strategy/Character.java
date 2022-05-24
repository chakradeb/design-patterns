package strategy;

public abstract class Character {
    WeaponBehaviour weapon;
    public void fight() {
        weapon.useWeapon();
    };

    public void setWeapon(WeaponBehaviour wb) {
        this.weapon = wb;
    }
}
