package LAB2;

public class ex1 {
    public static void main(String[] args) {
        String sir2 = new String("si");
        String sir1 = new String("sir1 si cu sir2 fac un sir3");
        int start_pos;
        int index = 0;
        int contor = 0;
            for (start_pos = 0; start_pos < sir1.length(); start_pos = index + 1) {
                index = sir1.indexOf(sir2, start_pos);
                if (index == -1) {
                    break;
                }
                if (index >= 0 && sir2.equals(sir1.substring(index, index + 2))) {
                    contor++;
                }
            }
        System.out.println("Sirul s2 apare in sirul s1 de: " + contor);
    }
}

