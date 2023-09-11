package PB1;

public class Romb extends Paralelogram{
    int diagonala1;
    int diagonala2;

    public Romb (int diagonala1, int diagonala2, int latura1, int latura2, int latura3, int latura4) {
        super (latura1, latura2, latura3, latura4);
        this.latura1 = this.latura3;
        this.latura2 = this.latura4;
        this.diagonala1 = diagonala1;
        this.diagonala2 = diagonala2;
        unghi2 = 180 - unghi1;
        unghi2 = unghi4;
    }

    public double arie_romb () {
        double rezultat;
        rezultat = (diagonala1 * diagonala2) / 2;
        return rezultat;
    }
}
