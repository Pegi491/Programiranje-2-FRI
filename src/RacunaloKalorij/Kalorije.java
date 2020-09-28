package src.RacunaloKalorij;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Kalorije {
    static HashMap<String, Integer> pretvori (String ime_dat){

        String files = ime_dat;
        HashMap<String, Integer> podatki = new LinkedHashMap<>();
        try{
            Scanner sc = new Scanner(new FileReader(files));
           while (sc.hasNextLine()){
               String[] vmesna = sc.nextLine().split(";");
               //System.out.println(vmesna[0] + " " + vmesna[1]);
               int toInt = Integer.parseInt(vmesna[1].strip());
               podatki.put(vmesna[0], toInt);
           }

        }
        catch (IOException e){
            e.printStackTrace();
        }
        return podatki;
    }

    static String[] vArray(HashMap<String,Integer> podatki){
        String[] vrni = new String[podatki.size()];
        int c = 0;
        for(String e : podatki.keySet()){
            vrni[c] = e;
            c++;
        }
        return vrni;
    }
    public static void main (String[] args){

    }
}
