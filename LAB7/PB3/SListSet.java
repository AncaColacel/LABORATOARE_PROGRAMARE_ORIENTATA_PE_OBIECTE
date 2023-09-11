package PB3;
import java.util.Collections;
import java.util.LinkedList;
import java.util.SortedSet;
import java.util.Comparator;

abstract class SListSet extends LinkedList implements SortedSet {
    Object first;   // primul obiect din multime
    Object last;    // ultimul obiect din multime
    Comparator comparator;

    public boolean add(Object o) {
        if (this.contains(o) == false) {
            super.add(o);
            Collections.sort(this);
            return true;
        }
        else
            return false;
    }
    public SortedSet subSet(Object from, Object to) {
        this.subSet(from, to);
        Collections.sort(this);
        return this;
    }

    // intoarce submultimea de elemente mai mici decat objectul dat ca parametru
    public SortedSet headSet(Object to) {
        this.headSet(to);
        Collections.sort(this);
        return this;
    }

    public SortedSet tailSet(Object from) {
        this.contains(from);
        Collections.sort(this);
        return this;
    }

}
