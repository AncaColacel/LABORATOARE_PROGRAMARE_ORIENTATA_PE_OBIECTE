package LAB9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

public class Problema6 extends JFrame implements ActionListener {
    JTextField text;
    JButton button;
    JScrollPane scroll;

    // permite afisarea continutul fisierului in scroll
    JTextArea textarea;

    public Problema6(String text_string) {
        super(text_string);

        // creare fereastra si setari pt ea
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500, 500));
        frame.getContentPane().setBackground(Color.MAGENTA);
        frame.setLayout(new FlowLayout());              // ???


        // creare scroll si introducere de text in el
        textarea = new JTextArea(15, 15);
        scroll = new JScrollPane(textarea);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.add(scroll);

        // creare label cu posibiliatea de a introduce text
        text = new JTextField(15);
        frame.add(text);
        text.addActionListener(this);

        // creare buton de verificare
        button = new JButton("Afiseaza");
        frame.add(button);
        button.addActionListener(this);

        frame.show();
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // daca s a apasat pe buton
        if (e.getSource() instanceof JButton) {
            // path retine calea introdusa in labelul de text
            String path = text.getText();
            // file retine file-ul de la calea respectiva
            File f = new File(path);

            // daca fisierul exista si nu este director
            if (f.exists() && !f.isDirectory()) {
                // scroll-ul devine vizibil
                scroll.setVisible(true);
                try {
                    // se citeste din fisier in variabila sc
                    Scanner sc = new Scanner(f);
                    String aux = "";

                    while(sc.hasNextLine()) {
                        // pana nu s a ajuns la finalul fisierului
                        // continutul se transfera in Stringul auxiliar
                        aux += sc.nextLine() + "\r\n";
                    }
                    // se adauga in scroll continutul fisierului
                    textarea.setText(aux);
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                // daca fisierul este director sau nu exista
                // el devine invizibil
                scroll.setVisible(false);
                text.setText("");
            }
        }
    }

    public static void main(String args[]) {
        Problema6 fereastra = new Problema6("problema6");
    }
}


