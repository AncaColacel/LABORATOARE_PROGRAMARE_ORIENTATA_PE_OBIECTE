package PB4;

import java.util.*;

public class WarriorPack {
    private Vector<Warrior> warriors = new Vector<>();
    Warrior_SNAKE w1;
    Warrior_OGRE w2;
    Warrior_MARSHMALLOW_MAN w3;

    public WarriorPack() {
        warriors = new Vector();
    }


    public void addWarrior(Warrior newWarrior) {
        warriors.add(newWarrior);
    }

    public Vector getWarriors() {
        return warriors;
    }

    public int calculateDamage() {
        int damage = 0;
        for (int i = 0; i < warriors.capacity(); i++) {
            if (warriors.get(i).getClass() == Warrior_SNAKE.class) {
                //Snake does 10 damage
                damage = damage + w1.getDamage_SNAKE();
            } else if (warriors.get(i).getClass() == Warrior_OGRE.class) {
                //Ogre does 6 damage
                damage = damage + w2.getDamage_OGRE();
            } else if (warriors.get(i).getClass() == Warrior_MARSHMALLOW_MAN.class) {
                //Marshmallow Man does 1 damage
                damage = damage + w3.getDamage_MARSHMALLOW_MAN();
            }
        }
        return damage;
    }

    public String toString () {
        String rez = "";
        for (int i = 0; i < warriors.size(); i++) {
            if (warriors.get(i).getClass() == Warrior_SNAKE.class) {
                rez = rez + "Extraterestrul este de tip SNAKE. Numele sau este: " + warriors.get(i).name + ", iar health-ul sau este: " + warriors.get(i).health + ". Damage-ul sau este 10." + "\n";
            }
            if (warriors.get(i).getClass() == Warrior_OGRE.class) {
                rez = rez + "Extraterestrul este de tip OGRE. Numele sau este: " + warriors.get(i).name + ", iar health-ul sau este: " + warriors.get(i).health + ". Damage-ul sau este 6." + "\n";
            }
            if (warriors.get(i).getClass() == Warrior_MARSHMALLOW_MAN.class) {
                rez = rez + "Extraterestrul este de tip MARSHMALLOW. Numele sau este: " + warriors.get(i).name + ", iar health-ul sau este: " + warriors.get(i).health + ". Damage-ul sau este 1." + "\n";
            }
        }
        return rez;
    }



}