package PB3;

import java.util.Hashtable;

public class HSet extends Hashtable {


    public boolean add (Object value) {
        int ok = 0;
        if (super.contains(value) == false) {
            super.put(value, value);
            ok = 1;
        }
        if (ok == 1) {
            return true;
        }
        else {
            return false;
        }

    }

    public Object remove(Object key) {
        int ok = 0;
        if (super.contains(key)) {
            super.remove(key);
            ok = 1;
        }
        if (ok == 1) {
            return true;
        }
        else {
            return false;
        }

    }

    public String toString() {
        return ("Elementele multimii sunt: " + keySet().toString());
        // am aplicat metoda keyset care imi va intoarce cheia setata
        // pentru a fi afisata apoi
    }
}
