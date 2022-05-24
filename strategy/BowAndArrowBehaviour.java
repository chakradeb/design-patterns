package strategy;

public class BowAndArrowBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Shooting Arrow with Bow");
    }
}
