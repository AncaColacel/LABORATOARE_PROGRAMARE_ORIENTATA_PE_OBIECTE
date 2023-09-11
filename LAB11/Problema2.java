package LAB11;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class Problema2 extends JFrame implements ListSelectionListener {
    JList lista_carti;
    JPanel panel1;
    JPanel panel2;
    JLabel label_autor;
    JLabel label_titlu;
    JTextField text_autor;
    JTextField text_titlu;
    Book carte2 = new Book("Harry Potter si camera secretor  ", "J.K. ROLLING", "");
    Book carte1 = new Book("Harry Potter si piatra filozofala  ", "J.K. ROLLING", "");
    Book carte3 = new Book ("Harry Potter si prizonierul din Azkaban  ", "J.K. ROLLING", "");
    Book carte4 = new Book ("Harry Potter si pocalul de foc  ", "J.K. ROLLING", "");
    Book carte5 = new Book("Suntem bine  ", "Nina LaCousen", "");
    DefaultListModel vector_carti = new DefaultListModel<Book>();



    public Problema2 () {
        super ("Problema2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


       vector_carti.addElement(carte1);
       vector_carti.addElement(carte2);
       vector_carti.addElement(carte3);
       vector_carti.addElement(carte4);
       vector_carti.addElement(carte5);




        lista_carti = new JList<>(vector_carti);
        panel1 = new JPanel();
        panel1.add(lista_carti);
        add(panel1, BorderLayout.WEST);


        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2, 2));
        label_autor = new JLabel("Author");
        label_titlu = new JLabel("Name");
        text_titlu = new JTextField();
        text_titlu.setPreferredSize(new Dimension(200, 10));
        text_autor = new JTextField();
        panel2.add(label_titlu);
        panel2.add(text_titlu);
        panel2.add(label_autor);
        panel2.add(text_autor);

        add(panel2, BorderLayout.EAST);
        lista_carti.addListSelectionListener(this);



        pack();
        setVisible(true);
        show();

    }



    public static void main(String[] args) {
        Problema2 pb2 = new Problema2();
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int index = e.getFirstIndex();
        if(lista_carti.isSelectionEmpty())
            return;
        else {
            text_titlu.setText(((Book)vector_carti.get(index)).getName());
            text_autor.setText(((Book)vector_carti.get(index)).getAuthor());

        }
    }
}
