//package PB2;
//
//import java.util.Comparator;
//import java.util.TreeSet;
//
//public class Catalog extends TreeSet<Catalog.Student> {
//
//
//    public void addStudent(String name, double medie, int clazz) {
//        Student s1 = new Student(name, medie, clazz);
//        this.add(s1);
//    }
//
//    public Student getStudent ( String name) {
//        for (Student i: this) {
//            if (i.name.compareTo(name) == 0) {
//                return i;
//            }
//        }
//        return null;
//    }
//
//    public void removeStudent ( String name) {
//        for (Student i: this) {
//            if (i.name.compareTo(name) == 0) {
//                this.remove(i);
//            }
//        }
//    }
//
//    public Catalog byClass (int clazz ) {
//
//    }
//
//    public class Student implements Comparable {
//        String name;
//        double media;
//        int clazz;
//
//        public Student (String name, double medie, int clazz) {
//            this.name = name;
//            this.media = medie;
//            this.clazz = clazz;
//        }
//
//        @Override
//        public int compareTo(Object o) {
//            if (this.name.compareTo(((Student) o).name) != 0) {
//                if (this.media > ((Student) o).media) {
//                    return 1;
//                } else if (this.media < ((Student) o).media) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//            else {
//                if (this.name.compareTo(((Student) o).name) < 0) {
//                    return -1;
//                }
//                else {
//                    return 1;
//                }
//
//            }
//
//        }
//
//        public String toString () {
//            return "Nume: " + this.name + "\n" + "Medie: " + this.media;
//        }
//
//    }
//}
//
