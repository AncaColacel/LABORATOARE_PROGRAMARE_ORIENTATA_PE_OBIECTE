package PB1;

public class StormFire extends BadLuck{

    @Override
    void execute(Hero h) {
        h.execute();
    }

    @Override
    void execute(Warrior w) {
        w.execute();
    }

    @Override
    void execute(Ninja n) {
        n.execute();
    }

    @Override
    void execute(Rogue r) {
        r.execute();
    }
}
