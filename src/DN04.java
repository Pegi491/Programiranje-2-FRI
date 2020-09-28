import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.lang.reflect.Array;

public class DN04 {

    static int BSD(String niz) {
        int checksum = 0;
        for (int i = 0; i < niz.length(); i++) {
            checksum = (checksum >> 1) + ((checksum & 1) << 15);
            checksum += niz.charAt(i);
            checksum &= 0xffff;
        }
        return checksum;
    }
    static String pretvori(char[] tabela){
        tabela[tabela.length -1]++;
        for(int i = tabela.length -1 ; i != 0; i--) {
            if(tabela[i] == '{' ) {
                    tabela[i] = 'a';
                    tabela[i-1]++;
                }
            }
        //System.out.println(tabela);
        return new String(tabela);
        }

    static String narediNiz(int x) {
        String izpis = "";
        for(int i = 0; i < x; i++) {
            izpis += 'a';
        }
        return izpis;
    }



    static void BSDenak(String x) {
        int z = BSD(x);
        String zacetek = narediNiz(x.length());
        int preverjaj = BSD(zacetek);
        while(z != preverjaj){
            preverjaj = BSD(zacetek);
            if(preverjaj == z){
                System.out.println(zacetek);
            }
            else{
                zacetek = pretvori(zacetek.toCharArray());
            }
        }
    }


    public static void main(String[] args){
            BSDenak(args[0]);
        }
    }
