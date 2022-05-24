package strategy;

public class KnifeBehaviour implements WeaponBehaviour{

    @Override
    public void useWeapon() {
        System.out.println("Cutting with Knife");
    }
}
