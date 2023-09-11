//package LAB12;
//
//public class Test {
//
//    public void addProduct(Product p) {
//        ShopSingleton.getInstanta().products.add(p);
//    }
//
//    public void removeProduct(Product p) {
//        ShopSingleton.getInstanta().products.remove(p);
//    }
//
//    public Product getCheapestProduct() {
//        Product produs_scump = new Product(10000, "haina");
//        for (Product produs : ShopSingleton.getInstanta().products) {
//            if (produs_scump.pret > produs.pret) {
//                produs_scump = produs;
//            }
//
//        }
//        return produs_scump;
//    }
//
//    public static void main(String[] args) {
//        Product p1 = new Product(20, "manusi");
//        Product p2 = new Product(50, "carte");
//        Product p3 = new Product(100, "Catan");
//
//        Test001 t = new Test001();
//        t.addProduct(p1);
//        t.addProduct(p2);
//        t.addProduct(p3);
//        System.out.println(t.getCheapestProduct());
//
//    }
//
//
//}
