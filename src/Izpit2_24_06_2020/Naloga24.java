package src.Izpit2_24_06_2020;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Naloga24 {

    static class Povezava{
        private String začetno_vozlišče_povezave;
        private String končno_vozlišče_povezave ;
        private int cena_povezave;

        public String getZačetno_vozlišče_povezave() {
            return začetno_vozlišče_povezave;
        }

        public void setZačetno_vozlišče_povezave(String zac) {
            this.začetno_vozlišče_povezave = zac;
        }

        public String getKončno_vozlišče_povezave() {
            return končno_vozlišče_povezave;
        }

        public void setKončno_vozlišče_povezave(String kon) {
            this.končno_vozlišče_povezave = kon;
        }

        public int getCena_povezave() {
            return cena_povezave;
        }

        public void setCena_povezave(int cena) {
            this.cena_povezave = cena;
        }

        public Povezava(String zac, String kon, int cena){
            this.začetno_vozlišče_povezave = zac;
            this.končno_vozlišče_povezave = kon;
            this.cena_povezave = cena;
        }


    }

    static ArrayList<Povezava> preberiPovezave (String imeDatoteke) throws FileNotFoundException {
        ArrayList<Povezava> povezave = new ArrayList<>();
        Scanner sc = new Scanner(new File(imeDatoteke));
        while (sc.hasNext()){
            String vrsta = sc.nextLine();
            //System.out.println(vrsta);
            String[] pos = vrsta.split(" ");
            povezave.add(new Povezava(pos[0], pos[1], Integer.parseInt(pos[2])));
        }
        return povezave;
    }
    static ArrayList<String> poisciPot (ArrayList<Povezava> povezave, String zacetek, int kako){
        ArrayList<String> pot = new ArrayList<>();
        ArrayList<String> vse_poti = new ArrayList<>();
        for (Povezava x: povezave){
            if (x.getZačetno_vozlišče_povezave().equals(zacetek)){
                pot.add(x.getZačetno_vozlišče_povezave());
            }
        }
        return pot;
    }
    public static void main(String[] args) throws FileNotFoundException {
        poisciPot(preberiPovezave("graf.txt"),"0", 0);



    }
}

