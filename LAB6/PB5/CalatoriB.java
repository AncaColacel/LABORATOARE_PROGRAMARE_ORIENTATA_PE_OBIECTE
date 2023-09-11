package PB5;

public class CalatoriB extends Vagon {

    public CalatoriB () {
            super(50, 400);
        }

        @Override
        public void DeschidereUsi() {
            System.out.println("VagonB => usile se deschid automat!");
        }

        @Override
        public void InchidereUsi() {
            System.out.println("VagonB => usile se inchid automat!");
        }

        @Override
        public void BlocareGeamuri() {
            System.out.println("VagonB => geamurile se blocheaza automat!");
        }
}


