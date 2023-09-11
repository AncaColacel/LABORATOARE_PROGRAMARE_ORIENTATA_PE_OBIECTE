package LAB9;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Problema4 extends JFrame implements ChangeListener {
    JSlider cursor1;
    JSlider cursor2;
    JSlider cursor3;
    JTextField text;
    JPanel panel;

    public Problema4() {
        super("Problema4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cursor1 = new JSlider(JSlider.VERTICAL, 0, 255, 0);

        cursor2 = new JSlider(JSlider.VERTICAL, 0, 255, 0);

        cursor3 = new JSlider(JSlider.VERTICAL, 0, 255, 0);

        cursor1.setPaintTrack(true);
        cursor1.setPaintTicks(true);
        cursor1.setPaintLabels(true);
        cursor2.setPaintTrack(true);
        cursor2.setPaintTicks(true);
        cursor2.setPaintLabels(true);
        cursor3.setPaintTrack(true);
        cursor3.setPaintTicks(true);
        cursor3.setPaintLabels(true);

        cursor1.setMajorTickSpacing(51);
        cursor1.setMinorTickSpacing(5);
        cursor2.setMajorTickSpacing(51);
        cursor2.setMinorTickSpacing(5);
        cursor3.setMajorTickSpacing(51);
        cursor3.setMinorTickSpacing(5);

        text = new JTextField(50);
        text.setEditable(false);


        panel = new JPanel();
        panel.add(cursor1);
        panel.add(cursor2);
        panel.add(cursor3);

        text.setText("Ponderile culorilor selectate sunt: RED -> " + cursor1.getValue() + "  GREEN -> "  + cursor2.getValue() + "  BLUE -> " + cursor3.getValue());
        cursor1.addChangeListener(this);
        cursor2.addChangeListener(this);
        cursor3.addChangeListener(this);

        add(panel, BorderLayout.CENTER);
        add(text, BorderLayout.SOUTH);
        pack();
        setVisible(true);

    }



    @Override
    public void stateChanged(ChangeEvent e) {
        text.setText("Ponderile culorilor selectate sunt: RED -> " + cursor1.getValue() + "  GREEN -> " + cursor2.getValue() + "  BLUE -> " + cursor3.getValue());
    }

    public static void main(String[] args) {
        Problema4 pb4 = new Problema4();
    }
}
