//package PB4;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Test04 {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        GenericListMethods lista_rezultat = new GenericListMethods();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(3);
//        System.out.println("Printare lista initiala cu duplicate " + list);
//        list = lista_rezultat.removeDuplicates(list);
//        System.out.println("Printare lista fara duplicate: " + list);
//        System.out.println("Elementul maxim din lista este: " + lista_rezultat.max(list));
//        // ordonare lista inainte de a aplica binary search
//        Collections.sort(list);
//        System.out.println("Elementul 2 se afla pe pozitia: " + lista_rezultat.binarySearch(list, 2, 0, list.size()));
//        System.out.println("Elementul 4 se afla pe pozitia: " + lista_rezultat.binarySearch(list, 4, 0, list.size()));
//
//    }
//}
