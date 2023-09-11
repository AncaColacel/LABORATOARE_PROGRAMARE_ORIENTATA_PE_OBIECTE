package PB1;

public abstract class ToppingDecorator implements IceCream {
    protected IceCream decoratorIceCream;

    public ToppingDecorator (IceCream decoratorIceCream) {
        this.decoratorIceCream = decoratorIceCream;
    }

    @Override
    public String getDescription() {
        return decoratorIceCream.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratorIceCream.getPrice();
    }
}
