package PB4;

public class Warrior_OGRE extends Warrior {
    private final int damage = 6;

    public Warrior_OGRE (int health, String name) {
        super (health, name);
    }

    public int getDamage_OGRE () {
        return damage;
    }
}
