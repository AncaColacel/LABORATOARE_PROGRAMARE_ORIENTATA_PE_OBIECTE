package PB2;

public class Magazin {
    String nume;
    Produs produs1 = new Produs("Harry Potter 1", 35, 10);
    Produs produs2 = new Produs("Harry Potter 2", 45, 15);
    Produs produs3 = new Produs("Harry Potter 3", 55,20);



    public static void main(String[] args) {
        // obiect anonim
        new Magazin("Carturesti");
        System.out.println(new Magazin("Carturesti"));
        System.out.println("Profitul magazinului este: " + new Magazin("Carturesti").getTotalMagazin() + " roni.");


    }

    public Magazin(String nume) {
        this.nume = nume;
    }

    public String toString () {
        return "Produs1: " + produs1.nume  + " pret: " + produs1.pret  + " cantitate: "  + produs1.cantitate + "\n"+ "Produs2: " + produs2.nume + " pret: " + produs2.pret + " cantitate: "  + produs2.cantitate + "\n" + "Produs3: " + produs3.nume + " pret: " + produs3.pret + " cantitate: "  + produs3.cantitate;
    }

    public double getTotalMagazin () {
        return produs1.getTotalProdus() + produs2.getTotalProdus() + produs3.getTotalProdus();
    }
}
