package PB1;

public class Paralelogram extends Patrulater {

    public Paralelogram(int latura1, int latura2, int latura3, int latura4) {
        super (latura1, latura2, latura3, latura4);
        this.latura3 = this.latura1;
        this.latura4 = this.latura2;
        unghi2 = 180 - unghi1;
        unghi2 = unghi4;

    }
    public double arie_paralelogram () {
        double rezultat;
        double unghi1_rad = Math.toRadians(unghi1);
        rezultat = latura1 * latura2 * Math.sin(unghi1_rad);
        return rezultat;
    }


}
