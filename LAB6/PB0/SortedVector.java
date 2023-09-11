package PB0;

import java.util.*;


class SortedVector extends Vector{
    Comparator c;
    public SortedVector(Comparator c){
        this.c=c;
    }

    /*public SortedVector(){
    this(null);
    } */

    // rescriere metoda add prin apelarea metodei add de la clasa de baza
    public boolean add(Object o) {
        super.add(o);
        Collections.sort(this, c);
        return true;
    }
}
