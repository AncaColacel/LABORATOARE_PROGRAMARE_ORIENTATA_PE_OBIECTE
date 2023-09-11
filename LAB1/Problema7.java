package LAB1;

public class Problema7 {
    public static void main(String[] args) {
        Problema7 rez = new Problema7();
        int i;
        int n = 20;
        for (i = 4; i <= n; i = i + 2) {
            System.out.println("------------------------------------------");
            rez.ipoteza(i);
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

    public void ipoteza (int n) {
        int i, j;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n; j++) {
                if (is_prime(i) && is_prime(j) == true && i + j == n) {
                    System.out.println(n + "=" + i + "+" + j);
                }
            }
        }

    }

}
