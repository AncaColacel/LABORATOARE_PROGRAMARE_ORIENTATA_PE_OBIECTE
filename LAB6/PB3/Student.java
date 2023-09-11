//package PB3;
//
//
//import java.util.Collection;
//import java.util.Vector;
//
//// clasa care implementeaza interfata va contine atat metodele interfetei, cat si metodele interfetei
//// pe care o mosteneste interfata Persoana
//public class Student implements Persoana {
//    private String nume;
//    private Vector<Double> medii = new Vector<>();
//
//    @Override
//    public String getNume() {
//        return nume;
//    }
//
//    @Override
//    public void setNume(String nume) {
//        this.nume = nume;
//    }
//
//    @Override
//    public void addMedie(double medie) {
//        medii.add(medie);
//    }
//
//    @Override
//    public double calculMedieGenerala() {
//        double medie = 0;
//        double suma = 0;
//        for (int i = 0; i < medii.size(); i++) {
//            suma = suma + medii.get(i);
//        }
//        medie = suma / medii.size();
//        return medie;
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        if (this.nume.compareTo(((Student) o).nume) == 0) {
//            double medie1 = ((Student) o).calculMedieGenerala();
//            double medie2 = this.calculMedieGenerala();
//            if (medie1 < medie2)
//                return -1;
//            if (medie1 > medie2)
//                return 1;
//            if (medie1 == medie2)
//                return 0;
//        }
//        if (this.nume.compareTo(((Student) o).nume) > 0) {
//            return 1;
//        }
//        else {
//            return -1;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Nume student: " + nume + ". Medie student: " + this.calculMedieGenerala();
//    }
//}
//
//
//
//
//
//
