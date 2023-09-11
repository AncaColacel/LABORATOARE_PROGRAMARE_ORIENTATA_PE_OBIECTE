package LAB9;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class Problema2 extends JFrame implements ActionListener {
    JTextField quiz;
    JRadioButton r1, r2, r3, r4;
    ButtonGroup group;
    JButton button;

    public Problema2(String fis) {
        super("Problema 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // pentru lungimea intrebarii
        quiz = new JTextField(150);
        // nu se permite introducerea de text in quiz
        // daca ii dadeam true se putea :)
        quiz.setEditable(false);

        // cele 4 butoane de raspunsuri
        r1 = new JRadioButton();
        r2 = new JRadioButton();
        r3 = new JRadioButton();
        r4 = new JRadioButton();
        // integrarea lor intr un buton de grup
        group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);
        // creare panel de butoane
        JPanel rb=new JPanel();
        rb.setLayout(new GridLayout(4,1));
        rb.add(r1);
        rb.add(r2);
        rb.add(r3);
        rb.add(r4);

        button = new JButton("Raspunde");
        button.setEnabled(false);
        button.addActionListener(this);

        // adaugarea elementelor pe fereastra
        add(quiz, BorderLayout.NORTH);
        add(rb, BorderLayout.CENTER);
        add(button,BorderLayout.SOUTH);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        r4.addActionListener(this);

        pack();
        setVisible(true);
        try {
            RandomAccessFile br = new RandomAccessFile(fis,"r");
            quiz.setText(br.readLine());
            r1.setText(br.readLine());
            r2.setText(br.readLine());
            r3.setText(br.readLine());
            r4.setText(br.readLine());

        } catch (IOException ex) {
            System.err.println("Exceptie");
        }
    }



    // in fucntia actionPerformed se scrie codul
    // pentru a se oferi raspuns evenimentului
    @Override
    public void actionPerformed(ActionEvent e) {
        // daca se selecteaza una din casute Raspunde devine activ
        if(e.getSource() instanceof JRadioButton) {
            button.setEnabled(true);
            // daca s a selectat butonul Raspunde
        } else if(e.getSource() instanceof JButton) {
            // si s a selectat r1 (care stim by default ca e cel corect)
            if(r1.isSelected()) {
                // r1 devine verde
                r1.setForeground(Color.green);
            } else {
                // daca nu a fost selectat r1 el devine rosu
                r1.setForeground(Color.red);
            }
            button.setEnabled(false);
        }
    }
    public static void main(String args[]) {
        Problema2 pb2 = new Problema2("C:\\Users\\ancam\\Desktop\\ANUL2\\AN2_SEM1\\POO\\LAB_POO\\src\\LAB9\\intrebare.txt");

    }
}
