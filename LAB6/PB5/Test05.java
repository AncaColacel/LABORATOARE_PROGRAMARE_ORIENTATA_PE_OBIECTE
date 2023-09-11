package PB5;

import java.util.Collections;
import java.util.Vector;

public class Test05 {
    public static void main(String args[]) {
        Tren t = new Tren();
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriB());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriB());
        t.addVagon(new CalatoriB());
        t.addVagon(new Marfa());
        System.out.println(t);
        Tren t1 = new Tren();
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriB());
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriA());
        System.out.println(t1);
        // construiesc un vector de trenuri pentru a putea folosi sortarea elementelor de tip tren
        Vector<Tren> vector_trenuri = new Vector<>();
        vector_trenuri.add(t);
        vector_trenuri.add(t1);
        // am sortat vectorul de trenuri crescator in functie de nr de colete
        Collections.sort(vector_trenuri);
        System.out.println(vector_trenuri);

    }
}
