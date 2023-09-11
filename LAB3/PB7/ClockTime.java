package PB7;

public class ClockTime {
    int hour;
    int minute;

    public ClockTime(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }
    public int diff(ClockTime c1)
    {
        int duration1, duration2;
        duration1 = hour * 60 + minute;
        duration2 = c1.hour * 60 + c1.minute;
        return duration2 - duration1;
    }
}
