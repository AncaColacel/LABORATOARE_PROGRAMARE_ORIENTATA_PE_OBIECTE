package LAB2;


import java.util.Vector;

public class ex5 {
    public static void main(String[] args) {
        String text = "Un terorist avea o bomba";
        String parsare[] = new String[5];
        parsare = text.split(" ", 5);
        String cuvinte[] = new String[2];
        cuvinte[0] = "terorist";
        cuvinte[1] = "bomba";
        String test[] = new String[5];
        Vector<String> array_word = new Vector<>();
        int i, j;
        int ok = 0;
        for (i = 0; i < cuvinte.length; i++) {
            for (j = 0; j < parsare.length; j++) {
                if (cuvinte[i].equals(parsare[j])) {
                    array_word.add(cuvinte[i]);
                    ok = 1;
                } else {
                    ok = 0;
                }
            }
        }

            if (ok == 0) {
                System.out.println("Nimic suspect!");
            } else {
                System.out.println("Text suspect");

            }
            int nr_l = 0;
            Vector <Character> v_caracter = new Vector<>();
            String caracter_1;
            String caracter_2;
            String replace = new String();
            String replace2 = new String();
            caracter_1 = array_word.get(0).substring(1, array_word.get(0).length() - 1);
            replace = array_word.get(0).replace(caracter_1, "******");
            System.out.println(replace);
            caracter_2 = array_word.get(1).substring(1, array_word.get(1).length() - 1);
            replace2 = array_word.get(1).replace(caracter_2, "***");
            System.out.println(replace2);
    }
}



