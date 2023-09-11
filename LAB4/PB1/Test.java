package PB1;

public class Test {
    public static void main(String[] args) {
        // testare paralelogram
        Paralelogram paralelogram1 = new Paralelogram(2, 4, 5, 6);
        paralelogram1.unghi1 = 30;
        double arie_paralelogram = paralelogram1.arie_paralelogram();
        System.out.println("Aria paralelogramului este: " + arie_paralelogram);

        // testare romb
        Romb romb1 = new Romb(2,6, 4,9, 7, 5);
        double arie_romb = romb1.arie_romb();
        System.out.println("Aria rombului este: " + arie_romb);

        // testare dreptunghi
        Dreptunghi dreptunghi1 = new Dreptunghi(2, 4, 7, 9);
        double arie_dreptunghi = dreptunghi1.arie_dreptunghi();
        System.out.println("Aria dreptunghiului este: " + arie_dreptunghi);

        // testare patrat
        Patrat patrat1 = new Patrat(2, 5, 7, 9);
        double arie_patrat = patrat1.latura1 * patrat1.latura1;
        System.out.println("Aria patratului este: " + arie_patrat);



    }


}
