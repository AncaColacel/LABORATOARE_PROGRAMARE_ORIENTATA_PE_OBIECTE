package PB4;

import java.util.Vector;

 public class Student extends Person{
    private Vector<String> courses = new Vector<>();
    private Vector<Integer> grades = new Vector<>();

    public Student(String name, String adress) {
        super(name, adress);

    }


    public void addCourseGrade (String course, int grade) {
        courses.add(course);
        grades.add(grade);
    }

    public void printGrades () {
        int i;
        for (i = 0; i < grades.size(); i++) {
            System.out.println(courses.get(i) + "--> " + grades.get(i));
        }
    }

    public double getAverageGrade () {
        int i;
        double medie = 0;
        double suma = 0;
        for (i = 0; i < grades.size(); i++) {
            suma = suma + (double) grades.get(i);
        }
        medie = suma / (double )grades.size();
        return medie;
    }


     public String toString() {
         return "Numele persoanei este: " + getName() + "\n" + "Adresa persoanei este: " + getAdress() + "\n" + "Persoana este student.";

    }
 }
