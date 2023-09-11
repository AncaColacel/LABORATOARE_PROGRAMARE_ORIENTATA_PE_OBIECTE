package LAB2;

import java.util.Vector;
import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>(10);
        Vector<Integer> v2 = new Vector<>(20);
        Vector<Integer> intersectie = new Vector<>(10);
        Vector<Integer> diferenta = new Vector<>(10);
        Vector<Integer> reuniune = new Vector<>(40);

        // Structura set contine elemente luate o singura data
        // va fi folosita la reuniune pentru a elimina duplicatele

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < v1.capacity(); i++) {
            v1.add(i);

        }
        for (int i = 0; i < v2.capacity(); i++) {
            v2.add(2 * i);
        }
        System.out.println("Prima multime: ");
        for (int i = 0; i < v1.size(); i++) {
            System.out.print(v1.get(i) + " ");
        }
        System.out.println();
        System.out.println("A doua multime: ");
        for (int i = 0; i < v2.size(); i++) {
            System.out.print(v2.get(i) + " ");
        }
        System.out.println();


        Integer nr = 0;
        Integer nr_1 = 0;
        for (int i = 0; i < v1.size(); i++) {
            for (int j = 0; j < v2.size(); j++) {
                if (v1.get(i).equals(v2.get(j))) {
                    nr = v1.get(i);
                    intersectie.add(nr);
                }
            }
        }
        System.out.println("Elementele multimii intersectie sunt: ");
        for (int k = 0; k < intersectie.size(); k++) {
            System.out.print(intersectie.get(k) + " ");

        }
        System.out.println();
        for (int i = 0; i < v1.size(); i++) {
            for (int j = 0; j < v2.size(); j++) {
                if (v1.get(i).equals(v2.get(j))) {
                    break;
                } else {
                    nr = v1.get(i);
                    diferenta.add(nr);
                }
            }
        }
        Integer z;
        System.out.println("Elementele multimii diferenta sunt: ");
        for (int k = 0; k < v1.size(); k++) {
            for (z = 0; z < intersectie.size(); z++) {
                if (v1.get(k).equals(intersectie.get(z))) {
                    break;
                }
            }

            if (z == intersectie.size()) {
                System.out.print(v1.get(k) + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < v1.size(); i++) {
            reuniune.add(v1.get(i));
        }
        for (int j = 0; j < v2.size(); j++) {
            reuniune.add(v2.get(j));
        }
        for (int i = 0; i < reuniune.size(); i++) {
            set.add(reuniune.get(i));
        }
        System.out.println("Elementele multimii reuniune sunt: ");
        System.out.println(set);

    }
}
