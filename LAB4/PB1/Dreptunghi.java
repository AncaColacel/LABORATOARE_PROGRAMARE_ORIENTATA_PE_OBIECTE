package PB1;

public class Dreptunghi extends Paralelogram {
    public Dreptunghi (int latura1, int latura2, int latura3, int latura4) {
        super (latura1, latura2, latura3, latura4);
        this.latura3 = this.latura1;
        this.latura4 = this.latura2;
        unghi1 = unghi2 = unghi3 = unghi4 = 90;
    }
    public double arie_dreptunghi () {
        double rezultat = latura1 * latura2;
        return rezultat;
    }
}
