package LAB2;

public class ex2 {
    public static void main(String[] args) {
        String cuvant = new String("sir2");
        String prop = new String("sir1 si sir2 sunt 2 siruri");
        ex2 rez = new ex2();
        System.out.println("Cuvantul " + cuvant + " se gaseste de " + rez.nr_ap(cuvant, prop) + " ori" + " in propozitia " + prop);
    }

    public int nr_ap(String word, String sen) {
        int contor = 0;
        String sol[] = new String[6];
        sol = sen.split(" ", 7);
        for (int i = 0; i < 6; i++) {
            if (word.equals(sol[i])) {
                contor++;
            }
        }
        return contor;
    }

}

