package PB6;

public class Graph {
    int n;
    final int Infinit = 9500;
    int matrice[][];

    public Graph(int n) {
        this.n = n;
        this.matrice = new int[n][n];
        // initializare matrice
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matrice[i][j] = Infinit;
            }
        }
    }
    public int getNr_noduri() {
        return n;
    }
    void addArc(int v, int w, int cost) {
        matrice[v][w] = cost;
    }
    boolean isArc(int v, int w) {
        if (matrice[v][w] != Infinit) {
            return true;
        }
        return false;
    }
    public String toString() {
        String rez = "";
        String temp = "";
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n ; j++) {
                rez = rez + "nod: " + i + " " + "nod: " + j + " " + " cost: " + matrice[i][j] + "\n";
                }
            }

        return rez;

    }

    public int[][] floydWarshall() {
        int result[][];
        result = new int[n][n];
        int k, i, j;
        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                if(i == j) {
                    result[i][j] = 0;
                } else if(isArc(i, j)) {
                    result[i][j] = matrice[i][j];
                } else {
                    result[i][j] = Infinit;
                }
            }
        }
        for(k = 0; k < n; k++) {
            for(i = 0; i < n; i++) {
                for(j = 0; j < n; j++) {
                    int dist;
                    dist = result[i][k] + result[k][j];
                    if(result[i][j] > dist) {
                        result[i][j] = dist;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);
        g.addArc(1, 3, 2);
        g.addArc(1, 2, 3);
        g.addArc(2, 3, 6);
        g.addArc(2, 1, 2);
        System.out.println(g);
        System.out.println("Floyd-Warshall");
        int [][] my_matrix = g.floydWarshall();
        System.out.println("distanta minima dintre nodurile 1 si 2 este "+ my_matrix[1][2]); // rezultat - 9
    }
}

