package strategy;

public class Main {
    public static void main(String[] args) {
        Character king = new King();
        WeaponBehaviour sword = new SwordBehaviour();
        WeaponBehaviour bowAndArrow = new BowAndArrowBehaviour();
        king.setWeapon(sword);
        king.fight();
        king.setWeapon(bowAndArrow);
        king.fight();

        Character queen = new Queen();
        queen.setWeapon(bowAndArrow);
        queen.fight();

        Character troll = new Troll();
        WeaponBehaviour knife = new KnifeBehaviour();
        troll.setWeapon(knife);
        troll.fight();

        Character knight = new Knight();
        WeaponBehaviour axe = new AxeBehaviour();
        knight.setWeapon(axe);
        knight.fight();
    }
}
