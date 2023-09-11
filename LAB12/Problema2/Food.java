package LAB12;

public class Food extends Product1 {
    public Food (float pret, String nume) {
        super(pret, nume);
    }

    public float getPriceReduced () {
        return this.pret - 0.20f * this.pret;
    }
}
