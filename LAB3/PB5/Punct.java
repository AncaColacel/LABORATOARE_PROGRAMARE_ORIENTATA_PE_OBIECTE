package PB5;

public class Punct {
    int abscisa;
    int ordonata;

    public Punct() {
        abscisa = 0;
        ordonata = 0;
    }
    public int getX() {
        return abscisa;
    }
    public void setX(int x)  {
        abscisa = x;
    }
    public int getY() {
        return ordonata;
    }
    public void setY(int y) {
        ordonata = y;
    }
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow (x - abscisa, 2) + Math.pow(y - ordonata, 2));
    }
    public double distance (Punct p1) {
        return Math.sqrt(Math.pow (p1.abscisa - abscisa, 2) + Math.pow(p1.ordonata - ordonata, 2));
    }
}
