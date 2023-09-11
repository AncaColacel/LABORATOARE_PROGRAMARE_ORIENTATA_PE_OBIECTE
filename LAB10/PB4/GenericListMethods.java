package PB4;

import java.util.ArrayList;
import java.util.Collections;

public class GenericListMethods implements PB4.GenericInterface {

    // ?? tipul returnat de functie
    public <E extends Comparable<E>> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<E>();  // lista care contine rezultatul
        // parcurgerea listei
        for(E iterator : list) {
            // daca nu se gaseste elementul din list in result se adauga
            if(result.contains(iterator) == false) {
                result.add(iterator);
            }
        }
        return result;
    }

    public <E extends Comparable<E>> E max(ArrayList<E> list) {
        return Collections.max(list);
    }

    public <E extends Comparable<E>> int binarySearch(ArrayList<E> list,E key, int start, int end) {
        // conditia de oprire (x nu se afla in list)
        if (start > end) {
            return -1;
        }
        //etapa divide
        int mid = (start + end) / 2;
        //etapa stapaneste
        E element = list.get(mid);
        // daca elementul cautat se afla pe mijloc
        if (element.compareTo(key)==0)
            return mid;
        // daca elementul cautat e mai mare se aplica metoda pe partea inferioara
        if (element.compareTo(key)>0)
            return binarySearch(list, key,start, mid-1);
        // daca elementul cautat e mai mic se aplica metoda pe partea superioara
        if (element.compareTo(key)<0)
            return binarySearch(list, key,mid+1, end);
        return 0;
    }


}
