package PB3;


public class MyQueue {
    private PB3.MyArray vector;
    private final int infinit = 9500;
    private int prim_indice;
    private int ultim_indice;
    int nr_elem;

    // constructor fara parametri
    // puteam sa nu-l trec :))
    public MyQueue() {
        prim_indice = 0;
        ultim_indice = -1;
        nr_elem = 0;
        vector = new PB3.MyArray();
    }

    public int getSize() {
        return nr_elem;
    }

    public void enqueue(int value) {
        nr_elem++;
        int pos = vector.getSize();
        vector.set(pos, value);
        ultim_indice++;
    }

    public int dequeue() {
        int x = vector.get(prim_indice);
        prim_indice = prim_indice + 1;
        nr_elem--;
        return x;
    }

    public boolean isEmpty() {
        if (nr_elem == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
         StringBuffer rez = new StringBuffer();
         int i;
         String  rez1 = new String();
         for (i = prim_indice; i <= ultim_indice; i++) {
             rez.append(vector.get(i) + " ");
             rez1 = new String(rez);
         }
         return rez1;
    }
}
