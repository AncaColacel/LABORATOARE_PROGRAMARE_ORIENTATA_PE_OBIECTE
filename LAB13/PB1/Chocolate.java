package PB1;

public class Chocolate extends ToppingDecorator {
    public Chocolate(IceCream decoratorIceCream) {
        super(decoratorIceCream);
    }

    @Override
    public String getDescription() {
        return decoratorIceCream.getDescription() + " ciocolata";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.5;
    }
}
