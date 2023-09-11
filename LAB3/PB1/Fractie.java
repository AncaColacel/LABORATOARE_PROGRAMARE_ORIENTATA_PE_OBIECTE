package PB1;

public class Fractie {
    // declarare atribute clasa
    int numarator;
    int numitor;

    // functia main care testeaza clasa Fractie
    public static void main(String[] args) {
        Fractie fractie1 = new Fractie(1,2);
        Fractie fractie2 = new Fractie(4,5);
        Fractie fractie3 = new Fractie(4,5);
        System.out.println(fractie1);
        System.out.println(fractie2);
        Fractie suma = new Fractie();
        suma = fractie1.adunare(fractie2);
        System.out.println(suma);
        System.out.println(fractie3.equals(fractie2));
        System.out.println(fractie1.equals(fractie2));


    }

    // un constructor care initializeaza ambele obiecte
    public Fractie(int numarator, int numitor) {
        this.numarator = numarator;
        this.numitor = numitor;
    }

    // un constructor fara argumente care utilizeaza constructorul anterior
    public Fractie () {
        this(0,0);
    }

    // metoda adunare aduna doua fractii si foloseste un singur parametru
    // DEOARECE calculele se petrec intre atributele parametrului
    // si atributele obiectului care apeleaza functia
    public Fractie adunare (Fractie f1) {
        int numarator_rez;
        int num_com;
        num_com = f1.numitor * numitor;
        numarator_rez = f1.numarator * numitor + numarator * f1.numitor;
        Fractie rezultat = new Fractie(numarator_rez,num_com);
        return rezultat;
    }
    // rescriere metoda clasica toString din clasa Object
    // pentru a printa formatul dorit
    public String toString () {
        return numarator + "/" + numitor;
    }

    // rescriere metoda clasica equals din clasa Object
    public boolean equals (Object o) {
        // daca obiectul == el insusi intoarce true
        if (o == this) {
            return true;
        }
        // daca obiectul nu este instanta clasei intoarce false
       if (!(o instanceof Fractie)) {
           return false;
       }
        // metoda compare este specifica clasei Integer, Double etc in functie de
        // tipul pe care il are atributul si este folosita pentru a compara,
        // iar tipul obiectului este cast-uit la tipul clasei
       return Integer.compare(((Fractie) o).numarator, numarator) == 0 && Integer.compare(((Fractie) o).numitor, numitor) == 0;
    }

    /* o alta varianta pentru functia equal
    public boolean equals (Object o) {
    if (this.numitor == ((Fractie)o).numitor && this.numarator == (Fractie)o).numarator)
        return true
    return false;
     */


}
