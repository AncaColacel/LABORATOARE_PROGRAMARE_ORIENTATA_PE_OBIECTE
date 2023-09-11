package PB3;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;


public class Problema3 {
    Scanner citire = new Scanner(System.in);
    Vector<Integer> vector_stocare = new Vector<>();
    int numar = 0;

    public void myRead() throws Nr_negat {
        // citire elemente vector
        for (int i = 0; i < vector_stocare.capacity(); i++) {
            System.out.print("Introduceti valoare: ");
            numar = citire.nextInt();
            if (numar >= 0) {
                vector_stocare.add(numar);
            } else {
                throw new Nr_negat("Numarul introdus este negativ!");
            }
        }
        // afisare vector
        for (int i = 0; i < vector_stocare.size(); i++) {
            System.out.println(vector_stocare.get(i));
        }
        // determinare element maxim din vector
        System.out.println("Elementul maxim din vector este: " + Collections.max(vector_stocare));
    }

    // metoda pentru maxim si printare
    public void max_element() {
        // afisare vector
        for (int i = 0; i < vector_stocare.size(); i++) {
            System.out.println("Elementul de pe pozitia " + i + " este: " + vector_stocare.get(i));
        }
        // determinare element maxim din vector
        System.out.println("Elementul maxim din vector este: " + Collections.max(vector_stocare));
    }


    public static void main(String[] args) {
        Problema3 obiect = new Problema3();
        try {
            obiect.myRead();
        } catch (Nr_negat e) {
            System.out.println(e.getMessage());
        }
        obiect.max_element();


    }
}

class Nr_negat extends Exception {
    public Nr_negat (String mesaj) {
        super(mesaj);
    }
}

