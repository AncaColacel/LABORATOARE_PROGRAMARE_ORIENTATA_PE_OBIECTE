package LAB12;

public class Computer extends Product1 {
    public Computer (float pret, String nume) {
        super(pret, nume);
    }

    public float getPriceReduced () {
        return this.pret - 0.10f * this.pret;
    }
}
