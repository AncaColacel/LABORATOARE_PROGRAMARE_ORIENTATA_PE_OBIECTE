package PB4;

public class Numar {
    int numar;


    public static void main(String[] args) {
        Numar numar = new Numar(2);
        System.out.println(numar.suma(1));
        System.out.println(numar.suma(1,2));
        System.out.println(numar.suma(1,2,3));
        System.out.println(numar.suma(1,2,3,2));
    }


    public Numar(int numar) {
        this.numar = numar;
    }

    public int suma (int a) {
        int rezultat = a + numar;
        return rezultat;
    }

    public int suma(int a, int b) {
        Numar numar = new Numar(2);
        int rezultat = numar.suma(a) + b;
        return rezultat;
    }

    public int suma (int a, int b, int c) {
        Numar numar = new Numar(2);
        int rezultat = numar.suma(a,b) + c;
        return rezultat;
    }

    public int suma (int a, int b, int c, int d) {
        Numar numar = new Numar(2);
        int rezultat = numar.suma(a,b,c) + d;
        return rezultat;
    }


}
