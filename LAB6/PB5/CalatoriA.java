package PB5;

public class CalatoriA extends Vagon {

    public CalatoriA () {
       super(40, 300);
    }

    @Override
    public void DeschidereUsi() {
        System.out.println("VagonA => usile se deschid automat!");
    }

    @Override
    public void InchidereUsi() {
        System.out.println("VagonA => usile se inchid automat!");
    }

    @Override
    public void BlocareGeamuri() {
        System.out.println("VagonA => geamurile NU se blocheaza automat!");
    }
}
