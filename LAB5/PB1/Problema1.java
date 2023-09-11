package PB1;
/**
 *
 * @author Nan Mihai
 */


/*
REGULI FOLOSITE: - blocurile statice se executa mereu inaintea celor nestatice in ordinea
                    in care sunt scrise in flow-ul programului.
 */

class Animal {
    private static String nume;
    private static String culoare;


    // prima chestie pe care vreau sa o afisez
    static {
        System.out.println("Bloc 2 - Animal");
    }
    // a doua chestie pe care vreau sa o afisez
    static {
        System.out.println("Bloc 2 - Caine");
    }

    // a cincea chestie pe care vreau sa o afisez
    {
        System.out.println("Bloc 1 - Animal");
        nume = "Animal";
        culoare = "negru";
    }


    public static String getCuloare() {
        return culoare;
    }
}

class Caine extends Animal {
    private static String tipRasa;

    // a sasea chestie pe care vreau sa o afisez
    {
        tipRasa = "medie";
        System.out.println("Bloc 1 - Caine " + getCuloare());
    }
    // a saptea chestie pe care vreau sa o afisez
     {
        System.out.println("Bloc 4 - Caine");
        tipRasa = "mica";
    }
    // a opta chestie pe care vreau sa o afisez
    {
        System.out.println("Bloc 3 - Caine");
        tipRasa = "mare";
    }


}
class SharPei extends Caine {
    private static int varsta;
    private static String taraProvenienta;

    // a treia chestie pe care vreau sa o afisez
    static {
        System.out.println("Bloc 1 - SharPei");
        taraProvenienta = "China";
    }
    // a patra  chestie pe care vreau sa o afisez
    static {
        System.out.println("Bloc 2 - SharPei " + taraProvenienta);
    }

    // a noua chestie pe care vreau sa o afisez
    {
        varsta = 5;
        System.out.println("Bloc 3 - SharPei " + varsta);
    }
}

class Problema1 {
    public static void main(String args[]) {
        SharPei cutu = new SharPei();
    }
}
