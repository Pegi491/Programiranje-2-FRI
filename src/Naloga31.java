package src;

import java.util.HashSet;

public class Naloga31 {

     public static String poisciUjemanje(String prvi, String drugi){
         String[] nizi = new String[2];
         nizi[0] = prvi;
         nizi[1] = drugi;
        HashSet<String> vsiNizi = new HashSet<>();
        String str = nizi[0];
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rez = str.substring(0, i) + str.substring(i + 1);
            vsiNizi.add(rez);
        }

        for(String e : vsiNizi){
            if(e.length() > ans.length()){
                ans = e;
            }
        }
         System.out.println(ans);
        return ans;
    }

    public static void main(String[] args){
        poisciUjemanje("Danes je lep dan", "Danaes je lep dan");
    }
}
