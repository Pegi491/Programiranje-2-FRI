package src.Izpit2_24_06_2020;

import java.util.HashMap;
import java.util.HashSet;

public class Naloga21 {
    public static void main(String[] args) {
        HashSet<String> vsiNizi = new HashSet<>();
        String str = args[0];
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            vsiNizi.add(ros);
        }

        for(String e : vsiNizi){
            System.out.println(e);
        }
    }
}
