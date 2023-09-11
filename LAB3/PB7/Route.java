package PB7;

public class Route {
    String origin;
    String destination;

    public Route(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public boolean check (Route r) {
        if (origin.equals(r.destination) && destination.equals(r.origin)) {
            return true;
        }
        return false;
    }
}
