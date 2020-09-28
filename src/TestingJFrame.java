package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Random;

public class TestingJFrame {
    public static void main(String[] args) {
        //Dodajanje gumbov, fildov, panelov
        JTextField randomST = new JTextField(10);
        JButton enter = new JButton("Enter");
        JButton barva = new JButton("Barva");
        JTextField koordinate = new JTextField(10);
        JPanel sredina = new JPanel();

        //Dolocanje kaj dela vsak gumb in kaj dobijo textFildi
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rand = (int) (Math.random() * 100);
                randomST.setText(Integer.toString(rand));
            }
        });

        barva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rnd = new Random();
                sredina.setBackground(new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            }
        });

        sredina.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                koordinate.setText(String.format("(%d, %d)", e.getX(), e.getY()));
            }
        });

        //Dodajanje na posamezne panele
        JPanel zgoraj = new JPanel(new FlowLayout(FlowLayout.LEFT));
        zgoraj.add(enter);
        zgoraj.add(randomST);
        zgoraj.add(barva);

        //FlowLayout doloci iz kater strani se dodajajo elemeti
        JPanel spodnja = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        spodnja.add(koordinate);


        //dolocanje okna in nato dodamogornje panele
        JFrame okno = new JFrame("Dobrav Pusi kurcino");

        //BorderLayout doloci iz kater strani se dodajajo elemeti
        okno.add(zgoraj, BorderLayout.PAGE_START);
        okno.add(sredina);
        okno.add(spodnja, BorderLayout.PAGE_END);
        okno.setSize(500, 500);
        okno.setVisible(true);
    }
}
