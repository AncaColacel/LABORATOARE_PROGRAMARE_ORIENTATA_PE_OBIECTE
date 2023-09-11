package PB5;

import java.util.Vector;
import java.lang.Comparable;


public class Tren implements Comparable{
    Vector<Vagon> tren = new Vector<>();

    public void addVagon (Vagon v) {
        tren.add(v);
    }
    public int CalculColete () {
        int nr_colete = 0;
        for (int i = 0; i < tren.size(); i++) {
            nr_colete = nr_colete + tren.get(i).getNr_colete();
        }
        return nr_colete;
    }

    @Override
    public int compareTo(Object o) {
        int nr1 = this.CalculColete();
        int nr2 = ((Tren) o).CalculColete();
        if (nr1 == nr2) {
            return 0;
        }
        if (nr1 > nr2) {
            return 1;
        }
        else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Trenul poate transporta: " + CalculColete() + " colete.";
    }
}
