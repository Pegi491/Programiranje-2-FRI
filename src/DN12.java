package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DN12 {
    public static void main(String[] args) {
        JFrame okno = new JFrame();
        okno.setLayout(new GridBagLayout());

        JButton izracunaj = new JButton("Izracunaj");

        JTextField prvoSt = new JTextField();
        JTextField drugoSt = new JTextField();
        JTextField operator = new JTextField();
        JLabel     enako = new JLabel("=");
        JTextField izracun = new JTextField();


        // poslusalec za izracunaj
        izracunaj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double prvo = Double.parseDouble(prvoSt.getText());
                Double drugo = Double.parseDouble(drugoSt.getText());
                double odg = 0;
                String operators = operator.getText();
                switch(operators){
                    case("+"):
                        odg = prvo + drugo;
                        izracun.setText(String.valueOf(odg));
                        break;
                    case("-"):
                        odg = prvo - drugo;
                        izracun.setText(String.valueOf(odg));
                        break;
                    case("*"):
                        odg = prvo * drugo;
                        izracun.setText(String.valueOf(odg));
                        break;
                    case("/"):
                        odg = prvo / drugo;
                        izracun.setText(String.valueOf(odg));
                        break;
                }

            }
        });

        GridBagConstraints gbc = new GridBagConstraints();

        gbc = new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.insets = new Insets(5, 5, 0 , 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.30;
        okno.add(prvoSt, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx=1;
        gbc.gridy=0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.10;
        gbc.insets = new Insets(5, 5, 0 , 5);
        okno.add(operator, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx=2;
        gbc.gridy=0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.30;
        gbc.insets = new Insets(5, 5, 0 , 5);
        okno.add(drugoSt, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx=3;
        gbc.gridy=0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 0 , 5);
        okno.add(enako, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx=4;
        gbc.gridy=0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.30;
        gbc.insets = new Insets(5, 5, 0 , 5);
        okno.add(izracun, gbc);

        gbc = new GridBagConstraints();
        gbc.weightx = 0.0;
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 0 , 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        okno.add(izracunaj, gbc);

        okno.setTitle("Racunalnik");
        okno.setLocation(500,500);
        okno.setSize(500,100);

        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);

    }
}


