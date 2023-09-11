package PB4;

public class Warrior {
    // se realizeaza incapsularea datelor prin utilizarea lui privat
    // ca si identificator de acces si functii de get si set
    // pentru prelucrarea acestor date

    private static final int SNAKE_Warrior = 0;
    private static final int OGRE_Warrior = 1;
    private  static final int MARSHMALLOW_MAN_Warrior = 2;

    //Stores one of the three above types
    //0 = dead, 100 = full strength
    public int health;
    public String name;

    public Warrior (int health, String name) {
        this.health = health;
        this.name = name;
    }

    public String toString () {
        String rez = "";
        if (this.getClass() == Warrior_SNAKE.class) {
            rez = rez + "Extraterestrul este de tip SNAKE. Numele sau este: " + this.name + ", iar health-ul sau este: " + this.health + ". Damage-ul sau este 10.";
        }
        if (this.getClass() == Warrior_OGRE.class) {
            rez = rez + "Extraterestrul este de tip OGRE. Numele sau este: " + this.name + ", iar health-ul sau este: " + this.health + ". Damage-ul sau este 6.";
        }
        if (this.getClass() == Warrior_MARSHMALLOW_MAN.class) {
            rez = rez + "Extraterestrul este de tip MARSHMALLOW. Numele sau este: " + this.name + ", iar health-ul sau este: " + this.health + ". Damage-ul sau este 1.";
        }
        return rez;

    }

    public static void main(String[] args) {
        Warrior extraterestru1 = new Warrior_SNAKE(10, "Snape");
        Warrior extraterestru2 = new Warrior_OGRE(50, "Lupin");
        Warrior extraterestru3 = new Warrior_MARSHMALLOW_MAN(80, "Sirius");
        System.out.println(extraterestru1);
        System.out.println(extraterestru2);
        System.out.println(extraterestru3);

        WarriorPack extraterestri = new WarriorPack();
        extraterestri.addWarrior(extraterestru1);
        extraterestri.addWarrior(extraterestru2);
        extraterestri.addWarrior(extraterestru3);
        System.out.println(extraterestri);

    }
}

