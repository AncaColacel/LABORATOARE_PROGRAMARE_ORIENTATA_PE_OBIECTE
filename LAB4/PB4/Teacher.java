package PB4;

import java.util.Vector;

public class Teacher extends Person {
    private Vector <String> courses = new Vector<>();

    public Teacher(String name, String adress) {
        super(name, adress);
    }

    public String toString() {
        return "Numele persoanei este: " + getName() + "\n" + "Adresa persoanei este: " + getAdress() + "\n" + "Persoana este profesor.";

    }

    public boolean addCourse (String curs) {
        int ok = 0;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).equals(curs)) {
                courses.addElement(curs);
                ok = 1;
            }
        }
        if ( ok == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean removeCourse (String curs) {
        int ok = 0;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).equals(curs)) {
                courses.remove(i);
                ok = 1;
            }
        }
        if ( ok == 0) {
            return false;
        }
        else {
            return true;
        }
    }


}
