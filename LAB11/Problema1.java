package LAB11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class Problema1 extends JFrame implements ActionListener {
    JList lista_carti;
    JPanel panel;
    JScrollPane scroll;
    Book carte2 = new Book("Harry Potter si camera secretor  ", "J.K. ROLLING", "");
    Book carte1 = new Book("Harry Potter si piatra filozofala  ", "J.K. ROLLING", "");
    Book carte3 = new Book ("Harry Potter si prizonierul din Azkaban  ", "J.K. ROLLING", "");
    Book carte4 = new Book ("Harry Potter si pocalul de foc  ", "J.K. ROLLING", "");
    Book carte5 = new Book("Suntem bine  ", "Nina LaCousen", "");



    public Problema1 () {
        super ("Problema1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Vector<Book> vector_carti = new Vector<>();
        vector_carti.add(carte1);
        vector_carti.add(carte2);
        vector_carti.add(carte3);
        vector_carti.add(carte4);
        vector_carti.add(carte5);
        vector_carti.add(carte4);
        vector_carti.add(carte3);
        vector_carti.add(carte4);
        vector_carti.add(carte5);
        vector_carti.add(carte4);



        lista_carti = new JList<>(vector_carti);
        panel = new JPanel();
        scroll = new JScrollPane(lista_carti);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel.add(scroll);
        add(panel);

        pack();
        setVisible(true);
        show();

    }

    public void actionPerformed (ActionEvent e) {
    }

    public static void main(String[] args) {
        LAB11.Problema1 pb1 = new LAB11.Problema1();
    }

}

