package LAB9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.Vector;

public class Problema5 extends JFrame implements ActionListener {
    private JButton button;
    private Vector<Color> vector;

    public Problema5(String text_string) {
        super(text_string);

        // creare fereastra
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(250, 250));
        // setare fundal pentru fereastra
        frame.getContentPane().setBackground(Color.PINK);
        frame.setLayout(new FlowLayout());

        // creare buton numit Colors
        button = new JButton("Colors");
        frame.add(button);

        // crare vector de culori
        vector = new Vector<Color>();
        vector.add(Color.GREEN);
        vector.add(Color.BLACK);
        vector.add(Color.RED);
        vector.add(Color.YELLOW);
        vector.add(Color.BLUE);
        vector.add(Color.GRAY);

        button.addActionListener(this);

        frame.show();
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton but = (JButton)e.getSource();
            // col are culoarea initiala a butonului
            Color col = but.getBackground();
            // i retine indexul culorii
            int i = vector.indexOf(col);
            if (i == -1) {
                i = 0;
                // primeste doar prima culoare din vector
                but.setBackground(vector.get(i));
                return;
            }
            if (i == vector.size() - 1) {
                i = 0;
                // primesti doar prima culoare din vector
                but.setBackground(vector.get(i));
                return;
            }
            i++;
            but.setBackground(vector.get(i));
        }
    }

    public static void main(String args[]) throws FileNotFoundException {
        Problema5 fereastra = new Problema5("Problema5");
    }
}

