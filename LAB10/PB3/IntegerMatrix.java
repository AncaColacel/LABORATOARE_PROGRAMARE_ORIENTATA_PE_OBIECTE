package PB3;

import java.util.ArrayList;

public class IntegerMatrix extends AMatrix<Integer> {


    @Override
    // adunare a doua matrice
    public AMatrix<Integer> addition(AMatrix<Integer> m1) {
        IntegerMatrix result = new IntegerMatrix();

        // se ia linie cu linie matricea, fiecare linie fiind un vector
        for(int i = 0; i < this.size(); i++) {
            ArrayList<Integer> resultLine = new ArrayList<Integer>();
            ArrayList<Integer> thisLine = this.get(i);
            ArrayList<Integer> mLine = m1.get(i);

            // si apoi fiecare element din vectorul linie este luat separat
            for(int j = 0; j < this.size(); j++)
                resultLine.add(this.sum(thisLine.get(j), mLine.get(j)));

            result.add(resultLine);
        }

        return result;
    }

    @Override
    // adunare a doua numere
    public Integer sum(Integer obj1, Integer obj2) {
        Integer suma = 0;
        suma = obj1 + obj2;
        return suma;
    }

    @Override
    public String toString() {
        String output = "";
        for(int i = 0; i < this.size(); i++) {
            ArrayList<Integer> line = this.get(i);
            for(int j = 0; j < this.size(); j++)
                output += line.get(j) + " ";
            output += "\n";
        }
        return output;
    }
}
