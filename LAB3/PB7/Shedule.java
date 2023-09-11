package PB7;

public class Shedule {
    ClockTime departure;
    ClockTime arrival;

    public Shedule(ClockTime departure,ClockTime arrival)
    {
        this.departure = departure;
        this.arrival = arrival;
    }

    public int trans_min () {
        int min = 0;
        int plecare = 0;
        int sosire = 0;
        plecare = departure.hour * 60 + departure.minute;
        sosire = arrival.hour * 60 + departure.minute;
        if (plecare > sosire) {
            sosire = sosire + 24 * 60;
        }
        min = sosire - plecare;
        return min;
    }


}
