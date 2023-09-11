package PB4;

public class Person {
    private String nume;
    private String adress;

    public Person (String nume, String adress) {
        this.nume = nume;
        this.adress = adress;
    }

    public String getName () {
        return nume;
    }

    public String getAdress () {
        return adress;
    }

    public void setAdress (String adress) {
        this.adress = adress;
    }

    public String toString () {
        return "Numele persoanei este: " + nume + "\n" + "Adresa persoanei este: " + adress;
    }
}
