package PB5;

public abstract class Vagon {
    private int capacitate_vagon;
    private int nr_colete;

    public Vagon (int capacitate_vagon, int  nr_colete) {
        this.capacitate_vagon = capacitate_vagon;
        this.nr_colete = nr_colete;
    }

    public int getCapacitate_vagon() {
        return capacitate_vagon;
    }

    public void setCapacitate_vagon(int capacitate_vagon) {
        this.capacitate_vagon = capacitate_vagon;
    }

    public int getNr_colete() {
        return nr_colete;
    }

    public void setNr_colete(int nr_colete) {
        this.nr_colete = nr_colete;
    }
    public abstract void DeschidereUsi();
    public abstract void InchidereUsi ();
    public abstract void BlocareGeamuri ();
}
