package PB1;

public class Circle extends Shape {
    double radius;

    public Circle () {
    }

    public Circle (double radius) {
        this.radius = radius;
    }

    public Circle (double radius, String colour, boolean filled) {
        super (colour, filled);
        this.radius = radius;
    }

    public double getRadius () {
        return radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public double getArea () {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Raza cercului este: " + radius + ". Perimetrul cercului este: " + getPerimeter() + ". Aria cercului este: " + getArea();
    }
}
