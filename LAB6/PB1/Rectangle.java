package PB1;

public class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle () {
    }

    public Rectangle (double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle (double width, double length, String colour, boolean filled) {
        super (colour, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth () {
        return width;
    }

    public void setWidth (double width) {
        this.width = width;
    }

    public double getLength () {
        return length;
    }

    public void setLength () {
        this.length = length;
    }

    public double getArea () {
        return length * width;
    }
     public double getPerimeter () {
        return 2 * length + 2 * width;
     }

     public String toString () {
         return "Lungimea si latimea sunt: " + length + width + ". Perimetrul dreptunghiului este: " + getPerimeter() + ". Aria dreptunghiului este: " + getArea();
     }
}
