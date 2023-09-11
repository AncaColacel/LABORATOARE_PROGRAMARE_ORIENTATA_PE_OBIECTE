package PB1;

public class BasicIceCream implements IceCream {
    @Override
    public String getDescription() {
        return "Ingrediente: con";
    }

    @Override
    public double getPrice() {
        return 0.5;
    }
}
