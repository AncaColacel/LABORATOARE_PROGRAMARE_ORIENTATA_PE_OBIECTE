package PB3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {
    public static IntegerMatrix creare_matrice() {
        IntegerMatrix matrice = new IntegerMatrix();
        // citire dimensiune matrice
        Scanner citire = new Scanner(System.in);
        int dimensiune = citire.nextInt();
        for (int i = 0; i < dimensiune; i++) {
            ArrayList<Integer> linie = new ArrayList<>();
            for (int j = 0; j < dimensiune; j++) {
                linie.add(citire.nextInt());
            }
            matrice.add(linie);
        }
        return matrice;
    }

    public static void main(String[] args) {
        IntegerMatrix m1 = new IntegerMatrix();
        m1 = creare_matrice();
        IntegerMatrix m2 = new IntegerMatrix();
        m2 = creare_matrice();
        System.out.println(m1.addition(m2));

    }



}
