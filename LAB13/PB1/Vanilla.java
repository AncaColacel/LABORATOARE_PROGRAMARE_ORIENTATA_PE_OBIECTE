package PB1;

public class Vanilla extends ToppingDecorator {

    public Vanilla(IceCream decoratorIceCream) {
        super(decoratorIceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " vanilie";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2;
    }
}
