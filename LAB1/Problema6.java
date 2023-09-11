package LAB1;

public class Problema6 {
    public static void main(String[] args) {
        Problema6 rez = new Problema6();
        int i;
        for (i = 0; i <= 20; i++) {
            if (rez.is_prime(i) == true) {
                System.out.println("Numarul " + i + " este prim.");
            }
            else {
                System.out.println("Numarul " + i + " nu este prim.");
            }
        }
    }

    public boolean is_prime(int n) {
        int ok = 1;
        if (n == 1 || n == 0) {
            return false;
        }

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    ok = 0;
                    break;
                }
            }

            if (ok == 1) {
                return true;
            } else {
                return false;
            }
    }

}
