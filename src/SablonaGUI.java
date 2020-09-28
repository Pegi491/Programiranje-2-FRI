package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class SablonaGUI {
    public static void main(String[] args) {
        JTextField datumTF = new JTextField(10);
        JButton gumbDatum = new JButton("Datum");
        JButton gumbBarva = new JButton("Barva");
        JTextField koorTF = new JTextField(10);
        JPanel sredina = new JPanel();

        gumbDatum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd. MM. yyyy");
                datumTF.setText(sdf.format(new Date()));
            }
        });

        sredina.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                koorTF.setText(String.format("(%d, %d)", e.getX(), e.getY()));
            }
        });

        gumbBarva.addActionListener((e)->{
            Random rnd = new Random();
            sredina.setBackground(new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
        });

        JPanel zgoraj = new JPanel(new FlowLayout(FlowLayout.LEFT));
        zgoraj.add(gumbDatum);
        zgoraj.add(datumTF);
        zgoraj.add(gumbBarva);

        JPanel spodaj = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        spodaj.add(koorTF);

        JFrame okno = new JFrame("Okno z datumom in miško");

        okno.add(zgoraj, BorderLayout.PAGE_START);
        okno.add(sredina);
        okno.add(spodaj, BorderLayout.PAGE_END);
        okno.setSize(500,500);
        okno.setVisible(true);
    }
}
