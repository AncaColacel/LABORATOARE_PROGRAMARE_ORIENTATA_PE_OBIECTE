package LAB12;

public class Beverage extends Product1 {
    public Beverage (float pret, String nume) {
        super(pret, nume);
    }

    public float getPriceReduced () {
        return this.pret - 0.05f * this.pret;
    }
}
