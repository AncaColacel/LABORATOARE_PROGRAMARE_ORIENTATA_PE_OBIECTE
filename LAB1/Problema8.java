package LAB1;

import java.util.Arrays;
public class Problema8 {
    public static void main(String[] args) {
        Double array [] = new Double[11];
        int i;
        for (i = 0; i < 10; i++) {
            array[i] = Math.random();
        }
        array[10] = 0.1408;
        Arrays.sort(array);
        for ( i = 0; i < 10; i++) {
            System.out.println("Elementul de pe indexul " + i + " este " + array[i]);
        }
        System.out.println("Elementul 0.1408 este pe indexul: " + Arrays.binarySearch(array, 0.1408));
    }
}
