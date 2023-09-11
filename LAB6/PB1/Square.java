package PB1;

public class Square extends Rectangle {
    double side;

    public Square () {

    }

    public Square (double side) {
        super(side, side);
    }

    public Square (double side, String colour, boolean filled) {
        super (side, side, colour, filled);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Latura patratului este: " + side + ". Perimetrul patratului este: " + getPerimeter() + ". Aria patratului este: " + getArea();
    }
}
