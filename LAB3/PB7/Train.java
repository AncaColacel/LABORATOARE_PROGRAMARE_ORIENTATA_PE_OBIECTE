package PB7;

public class Train {
    Route r;
    Shedule s;
    boolean local;

    public Train(Route r, Shedule s, boolean local) {
        this.r = r;
        this.s = s;
        this.local = local;
    }

    public int pret () {
        int time;
        time = s.trans_min();
        int X;
        if (local == true) {
            X = 1;
        } else {
            X = 2;
        }
        time = time * X;
        if (time < 0) {
            time = -time;
        }
        return time;
    }

    public static void main(String[] args) {
        Train t1,t2,t3,t4;
        t1 = new Train(new Route("Bucuresti Nord", "Constanta"),new Shedule(new ClockTime(9,35),new ClockTime(12,02)),true);
        t2 = new Train(new Route("Bucuresti Nord", "Iasi"),new Shedule(new ClockTime(5,45),new ClockTime(12,49)),true);
        t3 = new Train(new Route("Bucuresti Nord", "Sofia"),new Shedule(new ClockTime(23,45),new ClockTime(17,00)),false);
        t4 = new Train(new Route("Sofia", "Bucuresti Nord"),new Shedule(new ClockTime(20,30),new ClockTime(5,47)),false);
        System.out.println(t4.r.check(t3.r));
        System.out.println(t3.s.trans_min());
        System.out.println(t2.s.departure.diff(t1.s.departure));
        System.out.print(t3.pret());

    }
}


