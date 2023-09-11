package LAB1;

public class Problema5 {
    public static void main(String[] args) {
         Problema5 obiect = new Problema5();
         int rez;
         rez = obiect.power(2,3);
         obiect.print(rez);
        System.out.println("Rezultatul prin functia statica este: " + Math.pow(2,3));

    }
    public int power (int n, int exp) {
        if ( exp != 0) {
            return (n * power(n, exp - 1));
        }
        else {
            return 1;
        }
    }
    public void print (int numar) {
        System.out.println("Rezultatul este: " + numar);
    }
}
