package PB5;

public class Marfa extends Vagon {


        public Marfa () {
            super(0, 400);
        }

        @Override
        public void DeschidereUsi() {
            System.out.println("Marfa => usile NU se deschid automat!");
        }

        @Override
        public void InchidereUsi() {
            System.out.println("Marfa=> usile NU se inchid automat!");
        }

        @Override
        public void BlocareGeamuri() {
            System.out.println("Marfa => geamurile NU se blocheaza automat!");
        }
}


