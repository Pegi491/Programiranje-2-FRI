package src.Izpit2_24_06_2020;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Naloga22 {
    public static void main(String[] args) {
        JFrame okno = new JFrame();
        int x = 0;
        int y = 0;
        JButton[] gumbi = new JButton[101];
        for (int i = 0; i < gumbi.length; i++){
            gumbi[i] = new JButton(String.valueOf(i));
            gumbi[i].setLocation(x,y);
            gumbi[i].setSize(60,60);
            okno.add(gumbi[i]);
            x = x + 60;
            if (x >= 600){
                y = y + 60;
                x = 0;
            }
            int ker = i;
            gumbi[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Random rn = new Random();
                    int j = rn.nextInt(100);
                    System.out.println(gumbi[ker].getText());
                    gumbi[j].setText(String.valueOf(ker));
                    gumbi[ker].setText(String.valueOf(j));
                }
            });


        }
        okno.remove(gumbi[100]);




        okno.setTitle("Okno s datumom in misko");
        okno.setSize(618,640);
        okno.setLocation(300,300);
        okno.setVisible(true);
    }
}
