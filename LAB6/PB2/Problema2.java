package PB2;

import PB1.Rectangle;
import PB1.Square;
import PB1.Shape;
import PB1.Circle;

public class Problema2 {
    public static void main(String[] args) {
        // Rectangle r1 = new Shape(); nu putem instantia pentru ca este clasa abstracta
        Rectangle r1 = new Square();
        Square s = new Square();
        // (Circle) s;
        // (Shape) s;
        //System.out.println((Rectangle) s);
        //System.out.println(s instanceof Shape);
        //System.out.println(s instanceof Rectangle);

        Circle c1 = new Circle();
        // Square sq = (Square) c1;            nu se poate converti cercul la patrat

        //Conversie 2
        Square sq = new Square();
        Rectangle r = new Rectangle(5.0, 5.0);
        //sq = (Square) r;                        // DownCasting. ar merge daca r era instantiat de tipul Square

        //Conversie 3
        sq = new Square(7.0);
        r = sq;                                   // este UpCasting si merge pt ca se face implicit.
                                                  // este echivalent cu r = (Rectangle) sq


    }
}
