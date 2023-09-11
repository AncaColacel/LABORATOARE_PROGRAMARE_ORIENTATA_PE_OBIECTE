package LAB12;

import java.util.Vector;

public class ShopSingleton {
    String name;
    Vector<Product> products;
    private static ShopSingleton instanta = null;

    private ShopSingleton () {
        products = new Vector<>();
    }

    public static ShopSingleton getInstanta() {
        if (instanta == null) {
            instanta = new ShopSingleton();
        }
        return instanta;
    }

    public void showProducts () {
        for (Product produs : products) {
            System.out.println(produs);
        }
    }
}


