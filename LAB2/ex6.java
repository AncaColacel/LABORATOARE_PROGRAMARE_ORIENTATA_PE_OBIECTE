package LAB2;

import java.util.Vector;
public class ex6 {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector contor = new Vector<>();
        v.add(7.5);
        v.add("String");
        v.add("alabala");
        v.add("portocala");
        v.add(10);
        v.add(200);
        v.add(true);
        v.add(9.20000);
        v.add('A');
        int int_c = 0;
        int double_c = 0;
        int String_c = 0;
        int boolean_c = 0;
        int float_c = 0;
        int char_c = 0;
        int i;
        for (i = 0; i < v.size(); i++) {
            if (v.get(i).getClass() == Integer.class) {
                int_c++;
            }
            if (v.get(i).getClass() == Double.class) {
                double_c++;
            }
            if (v.get(i).getClass() == String.class) {
                String_c++;
            }
            if (v.get(i).getClass() == Float.class) {
                float_c++;
            }
            if (v.get(i).getClass() == Boolean.class) {
                boolean_c++;
            }
            if (v.get(i).getClass() == Character.class) {
                char_c++;
            }

        }
        contor.add(int_c);
        contor.add(double_c);
        contor.add(float_c);
        contor.add(String_c);
        contor.add(char_c);
        contor.add(boolean_c);

            i = 0;
            if (i == 0) {
                System.out.println("Nr de elemente de tipul int: " + contor.get(i));
                i++;
            }
            if (i == 1) {
                System.out.println("Nr de elemente de tipul double: " + contor.get(i));
                i++;
            }
            if (i == 2) {
                System.out.println("Nr de elemente de tipul float: " + contor.get(i));
                i++;
            }
            if (i == 3) {
                System.out.println("Nr de elemente de tipul String: " + contor.get(i));
                i++;
            }
            if (i == 4) {
                System.out.println("Nr de elemente de tipul char: " + contor.get(i));
                i++;
            }
            if (i == 5) {
                System.out.println("Nr de elemente de tipul boolean: " + contor.get(i));
                i++;
            }

    }
}
