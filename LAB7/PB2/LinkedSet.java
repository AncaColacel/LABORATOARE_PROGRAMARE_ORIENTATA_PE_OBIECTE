package PB2;

import java.util.LinkedList;
import java.util.Set;

public class LinkedSet extends LinkedList implements Set {

    public boolean add (Object obj) {
        if (this.contains(obj) ==  false) {
            super.add(obj);
            return true;
        }
        return false;
    }
    public void add (int i, Object obj) {
        if (this.contains(obj) == false) {
            super.add(i, obj);

        }
    }
    // metoda seteaza o noua valoare pe pozitia 1
    // si intoarce vechea valoare de pe pozitia i
    public Object set (int i , Object obj) {
        Object ret = new Object();
        if (this.contains(obj) == false) {
            ret = get(i);
            super.set(i, obj);
            return ret;
        }
        else {
            ret = get(i);
            return ret;
        }
    }
}
