package LAB12;

public class Product {
    float pret;
    String nume;

    public Product (float pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Product {" +
                " pret = " + pret +
                ", nume = " + nume + '\'' +
                '}';
    }
}
