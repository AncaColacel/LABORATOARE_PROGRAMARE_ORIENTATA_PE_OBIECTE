package PB2;

import java.util.Vector;


class Graph extends MyList {
    private Vector <Integer> viz = new Vector<>();
    //componentele clasei le fac private din motive de incapsulare
    public Graph(int n) {
        super(); // creare lista vida
        int i;
        //graful are listele de adiacenta, mai exact o lista mare cu liste si un vector, asta ca membri de clasa
        // ca metode sunt cele ce urmeaza
        for(i = 0; i < n + 1; i++) {
            viz.add(0);
            super.add(new MyList()); // adauga la lista un nod care e de fapt capul unei alte liste de adiac
            //se creaza o lista de adiacenta pentru fiecare nod, si sunt n liste/n capete de lista
        }
    }
    public void add(int x, int y) { //rescriu add-ul ptr vector
        MyList list = (MyList) get(x); //din lista de liste iau lista de x
        list.add(y); //si adaug un nod
    }
    public void dfs(int start) {
        int i,j;
        MyList list;
        System.out.print(start);
        System.out.print(" ");
        list = (MyList) get(start);
        viz.set(start,1);
        if(list != null) {
            for(i = 0; i < list.size(); i++) {
                j = (int) list.get(i);
                if(viz.get(j) == 0) {
                    dfs(j);
                }
            }
        }

    }
    public String toString() {
        int i;
        MyList list;
        StringBuffer sb = new StringBuffer("");
        for(i = 1; i < size(); i++) {
            list = (MyList) get(i);
            sb.append(i);
            sb.append(": ");
            sb.append(list);
            sb.append("\n");
        }
        String s = new String(sb);
        return s;
    }

    public static void main(String[] args) {
        Graph graf = new Graph(8);
        graf.add(1,2);
        graf.add(1,5);
        graf.add(1,8);
        graf.add(2,3);
        graf.add(3,4);
        graf.add(4,2);
        graf.add(5,6);
        graf.add(6,3);
        graf.add(6,7);
        graf.add(6,8);
        graf.dfs(1);
        System.out.println();
        System.out.println(graf);

    }
}