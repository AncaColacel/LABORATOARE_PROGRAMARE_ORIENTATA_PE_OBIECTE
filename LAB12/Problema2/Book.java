package LAB12;

public class Book extends Product1 {

    public Book (float pret, String nume) {
        super(pret, nume);
    }

    public float getPriceReduced () {
        return this.pret - 0.15f * this.pret;
    }
}

