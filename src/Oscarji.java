package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Oscarji {
    public static void main(String[] args){
        String moski = "igralci1.csv";
        String zenske = "igralke1.csv";

        String line = "";
        String razdeli = ",";


        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> dvojna = new ArrayList<>();

        try {
            Scanner man = new Scanner(new FileReader(moski));
            Scanner woman = new Scanner(new FileReader(zenske));

            while(man.hasNextLine()){
                a.add(man.nextLine());
            }
            while(woman.hasNextLine()){
                b.add(woman.nextLine());
            }
            //Collections.sort(vse);
            for(int i = 0; i < a.size(); i++) {
                String[] prva = a.get(i).split(razdeli);
                for (int c = 0; c < b.size(); c++) {
                    String[] druga = b.get(c).split(razdeli);
                    if (prva[4].equals(druga[4])) {
                        String izpis = String.format("Film: %s, Leto: %s, igralka: %s, igralec: %s", prva[4], prva[1], druga[3], prva[3]);
                        dvojna.add(izpis);
                    }
                }
            }

        } catch (IOException e){
            e.printStackTrace();
        }

        Collections.sort(dvojna);
        for(String ele : dvojna) {
            System.out.println(ele);
        }
    }

}
