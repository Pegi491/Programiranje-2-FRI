package src.PripravaIzpit;

import javax.swing.*;
import java.awt.*;

public class Okno {
    public static void main(String[] args) {
        JFrame okno = new JFrame();

        JPanel top = new JPanel();
        top.setBackground(Color.blue);
        top.setSize(500, 300);
        JPanel left = new JPanel();
        left.setBackground(Color.yellow);
        JPanel center = new JPanel();
        center.setBackground(Color.black);
        JPanel right = new JPanel();
        right.setBackground(Color.orange);
        JPanel bottom = new JPanel();
        bottom.setBackground(Color.pink);

        JButton izhod = new JButton("Exit");
        JButton start = new JButton("Start");


        okno.setLayout(new BorderLayout());
        okno.add(top, BorderLayout.PAGE_START);
        okno.add(left, BorderLayout.LINE_START);
        okno.add(center, BorderLayout.CENTER);
        okno.add(right, BorderLayout.PAGE_END);
        okno.add(bottom, BorderLayout.LINE_END);

        //okno.setSize(500, 500);
        okno.setLocation(500,500);
        okno.pack();
        okno.setVisible(true);
    }
}
