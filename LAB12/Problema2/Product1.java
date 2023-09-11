package LAB12;

abstract class Product1 {
    float pret;
    String nume;

    public Product1 (float pret, String nume) {
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
