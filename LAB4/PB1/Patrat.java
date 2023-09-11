package PB1;

public class Patrat extends Dreptunghi {

   public Patrat (int latura1, int latura2, int latura3, int latura4) {
       super (latura1, latura2, latura3, latura4);
       this.latura3 = this.latura4 = this.latura2 = this.latura1;

   }
    public double arie_patrat () {
        double rezultat = latura1 * latura1;
        return rezultat;
    }

}
