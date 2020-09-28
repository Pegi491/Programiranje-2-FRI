package src.RacunaloKalorij;
import src.RacunaloKalorij.Kalorije.*;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.concurrent.Flow;

import static src.RacunaloKalorij.Kalorije.pretvori;
import static src.RacunaloKalorij.Kalorije.vArray;

public class GUI {
    public static void main(String[] args) {


        JFrame okno = new JFrame();
        okno.setLayout(new GridBagLayout());

        JTextField izpisKalorij = new JTextField("Kalorije",5);
        JButton click = new JButton("Click");


        JTextField ime = new JTextField(10);
        JTextField kalorije = new JTextField(10);
        JButton dodajBtn = new JButton("Dodaj ");



        HashMap<String, Integer> foodData = pretvori("FoodCal2.txt");
        String[] zaCombo = vArray(foodData);
        final String[] selectedFood = {zaCombo[0]};

        JComboBox<String> combo = new JComboBox<String>();

        for(String e : zaCombo){
            combo.addItem(e);
        }
        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> vrednost = (JComboBox<String>) e.getSource();
                selectedFood[0] = (String) vrednost.getSelectedItem();

            }
        });

        click.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = foodData.get(selectedFood[0]);
                izpisKalorij.setText(Integer.toString(x));
            }
        });

        JPanel elements = new JPanel(new GridBagLayout());
        elements.add(combo);
        elements.add(click);
        elements.add(izpisKalorij);

        JPanel novVnos =  new JPanel(new GridBagLayout());
        //novVnos.add(dodajVnos);
        novVnos.add(dodajBtn);

        JPanel zgornja = new JPanel(new FlowLayout(FlowLayout.CENTER));
        zgornja.add(elements, BorderLayout.PAGE_START);
        zgornja.add(novVnos, BorderLayout.PAGE_END);

        JFrame mainOkno = new JFrame("Topilec mascobe");
        mainOkno.add(zgornja, BorderLayout.PAGE_START);
        //mainOkno.add(novVnos, BorderLayout.PAGE_START);
        mainOkno.setSize(800,500);
        mainOkno.setVisible(true);
    }
}
