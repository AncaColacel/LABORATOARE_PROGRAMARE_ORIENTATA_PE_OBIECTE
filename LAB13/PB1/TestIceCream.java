package PB1;

public class TestIceCream {
    public static void main(String[] args) {
        IceCream iceCream1 = new Vanilla(new Chocolate(new BasicIceCream()));
        System.out.println(iceCream1.getDescription());
        System.out.println(iceCream1.getPrice());
        IceCream iceCream3 = new Chocolate(new BasicIceCream());
        System.out.println(iceCream3.getDescription());
        System.out.println(iceCream3.getPrice());
        IceCream iceCream2 = new BasicIceCream();
        System.out.println(iceCream2.getDescription());
        System.out.println(iceCream2.getPrice());

    }
}
