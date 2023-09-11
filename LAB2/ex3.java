package LAB2;

import java.util.Vector;
import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        Random generator = new Random();
        Vector <Integer>v = new Vector();
        int i;
        int nr = 0;
        for (i = 0; i < 20; i++) {
            nr = generator.nextInt(0, 10);
            v.add(nr);
        }
        ex3 rez = new ex3();
        int contor = 0;
        contor = rez.nr_ap(v, 4);
        System.out.println("Nr de aparitii a caracterului este: " + contor);
        System.out.println("-------------------------------------------");
        for (i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        // partea a doua de task
        Integer suma = 0;
        Double media = 0.00;
        Integer nr_med = 0;
        for (i = 0; i < v.size(); i++) {
            nr_med = (Integer) v.get(i);
            suma = suma + nr_med;
        }
        // Double nu este o clasa primitiva asa ca a fost nevoie
        // sa folosim aceasta metoda pentru a face cast
        media = suma / Double.valueOf(v.size());
        System.out.println("Media elementelor din vector este: " + media);

        Integer max = (Integer) v.get(0);
        for ( i = 0; i < v.size(); i++) {
            if (v.get(i) > max) {
                max = (Integer) v.get(i);
            }
        }
        System.out.println("Maximul din vectorul este: " + max);
        Integer min = (Integer) v.get(0);
        Integer pos_min = 0;
        for ( i = 0; i < v.size(); i++) {
            if (v.get(i) < min) {
                min = (Integer) v.get(i);
                pos_min = v.indexOf(v.get(i));
            }
        }
        System.out.println("Pozitia pe care se afla minimul este: " + pos_min);





    }
    public int nr_ap (Vector v, Integer x) {
        int contor = 0;
        int i;
        for (i = 0; i < v.size(); i++) {
            if (v.get(i).equals(x)) {
               v.remove(i);
                contor ++;
            }
        }
        return contor;
    }
}
