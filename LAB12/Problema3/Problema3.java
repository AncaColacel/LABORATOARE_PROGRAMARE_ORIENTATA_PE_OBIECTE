package Problema3;

import java.util.concurrent.Callable;

public class Problema3 {
    public static void main(String[] args) {
        Channel c = new Channel();
        User a = new User("Anna", c);
        User b = new User("Bella", c);
        c.newVideoUploaded("ANUL VIITOR PE VREMEA ASTA: RECENZIE ");
        Channel c1 = new Channel();
        a = new User("Anna", c1);
        b = new User("Bella", c1);
        c1.newVideoUploaded("SCRISOAREA DE CRACIUN: RECENZIE ");

    }
}
