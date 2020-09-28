package Tarok;
import java.util.Random;

public class Tarok {
    private static final int ST_KART = 54;
    private static final int STOLPCI = 8;

    private static final char srce = '\u2665';  // ♥
    private static final char karo = '\u2666';  // ♦
    private static final char kriz = '\u2663';  // ♣
    private static final char pik  = '\u2660';  // ♠

    private static char barve[]      = {srce, karo, kriz, pik};
    private static int prazneRdece[] = {1, 2, 3, 4};
    private static int prazneCrne[]  = {10, 9, 8, 7};
    private static String figure[]   = {"Fant", "Kaval", "Dama", "Kralj"};
    private static String taroki[]   = {"I", "II", "III", "IIII", "V", "VI", "VII",
            "VIII", "IX", "X", "XI", "XII", "XIII", "XIV",
            "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "SKIS"};

    static void izpisi(String[] tabela){
        int stolpci = STOLPCI;
        int c = 1;
        int karte = 0;
        while(karte < tabela.length) {
            System.out.printf("%11s   ", tabela[karte]);
            karte++;
            if(c % stolpci == 0) {
                System.out.println();
            }
            c++;
        }
    }


    static String[] ustvariKarte(){
        String [] kupcek = new String[ST_KART];
        int counter = 0;
        for(int b = 0; b < barve.length; b++){
            if(b < 2) {
                for (int k = 0; k < prazneRdece.length; k++) {
                    String karta = "" + barve[b] + prazneRdece[k]+ " ";
                    karta += "("+vrednostKarte(karta)+")";
                    kupcek[counter] = karta;
                    counter++;
                }
                for(int f = 0; f<figure.length; f++){
                    String karta = "" + barve[b] + figure[f] + " ";
                    karta += "("+vrednostKarte(karta)+")";
                    kupcek[counter] = karta;
                    counter++;
                }
            }
            if(b > 1) {
                for (int k = 0; k < prazneCrne.length; k++) {
                    String karta = "" + barve[b] + prazneCrne[k]+ " ";
                    karta += "("+vrednostKarte(karta)+")";
                    kupcek[counter] = karta;
                    counter++;
                }
                for(int f = 0; f<figure.length; f++){
                    String karta = "" + barve[b] + figure[f]+ " ";
                    karta += "("+vrednostKarte(karta)+")";
                    kupcek[counter] = karta;
                    counter++;
                }
            }
        }
        for(int k = 0; k < taroki.length; k++){
            String karta = taroki[k];
            karta += " ("+vrednostKarte(karta)+")";
            kupcek[counter] = karta;
            counter++;
        }
        return kupcek;
    }

    static String[] premesajKarte(String[] kupcek, int x){
        Random random = new Random();
        int c = 0;
        while(c < x) {
            int a = random.nextInt(54);
            int b = random.nextInt(54);
            String z = kupcek[a];
            kupcek[a] = kupcek[b];
            kupcek[b] = z;
            c++;
        }
        return kupcek;
    }

    static int vrednostKarte(String x){
        x = x.split(" ")[0];
        if(x.equals("I") || x.equals("XXI") || x.contains("SKIS")|| x.contains("Kralj")){
            return 5;
        }else if(x.contains("Dama")){
            return 4;
        }else if(x.contains("Kaval")){
            return 3;
        }else if(x.contains("Fant")){
            return 2;
        }
        return 1;
    }
     static int preprostoStetje(String[] kupcek){
        int vrednost = 0;
        for(int i = 0; i < kupcek.length; i++){
            vrednost = vrednost + vrednostKarte(kupcek[i]);
        }
        return vrednost;
     }

     static int natancnoStetje(String[] kupcek, int zacetek, int meja, boolean izpis){
        int skupna = 0;
        for(int i = zacetek; i < meja; i= i+3){
            if(meja-i < 2) {
                String[] izracun = {kupcek[i]};
                if(izpis) {
                    System.out.printf("Trojka:  %11s       %11s     %11s    #%s\n", kupcek[i], "-", "-", preprostoStetje(izracun) - 1);
                }
                skupna = skupna + preprostoStetje(izracun) - 1;
            }
            else if (meja-i <= 2) {
                String[] izracun = {kupcek[i], kupcek[i + 1]};
                if(izpis) {
                    System.out.printf("Trojka:  %11s       %11s     %11s    #%s\n", kupcek[i], kupcek[i + 1], "-", preprostoStetje(izracun) - 1);
                }
                skupna = skupna + preprostoStetje(izracun) -1;
            }else{
                String[] izracun = {kupcek[i], kupcek[i + 1], kupcek[i + 2]};
                if(izpis) {
                    System.out.printf("Trojka:  %11s       %11s      %11s   #%s\n", kupcek[i], kupcek[i + 1], kupcek[i + 2], preprostoStetje(izracun) - 2);
                }
                skupna = skupna + preprostoStetje(izracun) -2;
            }
        }
        return skupna;
     }

    public static void main(String[] args){
        String[] kupcek = ustvariKarte();
        premesajKarte(kupcek, 500);
        int meja = 30;
        System.out.println("Prvi kup kart:");
        int kupcek1 = natancnoStetje(kupcek, 0, meja, true);
        System.out.printf("Natancno stetje 1. kupa kart: %d\n", kupcek1);
        System.out.println();
        System.out.println("Drugi kup kart:");
        int kupcek2 = natancnoStetje(kupcek, meja, ST_KART, true);
        System.out.printf("Natancno stetje 2. kupa kart: %d\n", kupcek2);
        System.out.printf("\nSkupaj oba kupa kart: %d\n", kupcek1 + kupcek2);

        }
}
