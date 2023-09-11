package LAB12;

public class Test001 {
//
//    public void addProduct(Product1 p) {
//        ShopSingleton.getInstanta().products.add(p);
//    }
//
//    public void removeProduct(Product1 p) {
//        ShopSingleton.getInstanta().products.remove(p);
//    }
//
//    public Product1 getCheapestProduct() {
//        Product1 produs_scump = new Product1(10000, "bomboana");
//        for (Product1 produs : ShopSingleton.getInstanta().products) {
//            if (produs_scump.pret > produs.pret) {
//                produs_scump = produs;
//            }
//
//        }
//        return produs_scump;
//    }

    public static void main(String[] args) {
       ProductFactory factory = new ProductFactory();
       Book produs = (Book)(factory.factory("Book", "A fost odata un  dulap", 45));
       Product1 produs1 = factory.factory("Food", "mere", 10);
       System.out.println(produs.getPriceReduced());




    }


}
