package LAB9;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class Problema3 extends JFrame implements ItemListener, ActionListener {
    JTextField quiz;
    JCheckBox r1, r2, r3, r4;
    JButton button;

    public Problema3(String fis) {
        super("Problema 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // pentru lungimea intrebarii
        quiz = new JTextField(150);
        // nu se permite introducerea de text in quiz
        // daca ii dadeam true se putea :)
        quiz.setEditable(false);

        // cele 4 butoane de raspunsuri
        r1 = new JCheckBox();
        r2 = new JCheckBox();
        r3 = new JCheckBox();
        r4 = new JCheckBox();
        // creare panel de butoane
        JPanel rb=new JPanel();
        rb.setLayout(new GridLayout(4,1));
        rb.add(r1);
        rb.add(r2);
        rb.add(r3);
        rb.add(r4);

        button = new JButton("Sa vedem ce ai facut");
        button.setEnabled(false);
        button.addActionListener(this);


        // adaugarea elementelor pe fereastra
        add(quiz, BorderLayout.NORTH);
        add(rb, BorderLayout.CENTER);
        add(button,BorderLayout.SOUTH);

        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);
        r4.addItemListener(this);

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




    @Override
    // functia caracteristica pentru ItemListener
    public void itemStateChanged(ItemEvent e) {
        // desi i am dat sa fie "ascultat" butonul are nevoie sa fie si activat
        // acest lucru este realizat de aceasta functie
        button.setEnabled(true);
    }

    // functia caracteristica pentru ActionListener
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() instanceof JButton) {
            if (r1.isSelected() && r3.isSelected()) {
                r1.setForeground(Color.green);
                r3.setForeground(Color.green);
                r2.setForeground(Color.red);
                r4.setForeground(Color.red);

            }
            else {
                r1.setForeground(Color.green);
                r3.setForeground(Color.green);
                r2.setForeground(Color.red);
                r4.setForeground(Color.red);
            }
            button.setEnabled(false);
        }

    }
    public static void main(String args[]) {
        Problema3 pb3 = new Problema3("C:\\Users\\ancam\\Desktop\\ANUL2\\AN2_SEM1\\POO\\LAB_POO\\src\\LAB9\\intrebare.txt");

    }



}

