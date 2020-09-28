package src.vaje05;
import java.util.Scanner;

public class Vaje05 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(">> ");
        String vnos = input.nextLine();
        if(vnos.equals("1")){

        }
    }

    public static void izpisiNavodila(){
        System.out.println("1: naredi seznam, 2: dodaj element, 3: odstrani element, 4: izpiši seznam, 5: izpiši 64 bitno, q: izhod, h: pomoč");
    }
}

class Seznam {
    // Seznam, kjer shranimo zeljene elemente.
    private static String[] seznam;
    private static int dolzina = 0;

    /**
     * Inicializira seznam z tabelo dolzine n.
     * @param n
     */
    public static void narediSeznam(int n){
        if(seznam.length == n){
            System.out.printf("Seznam z dolžino %d je že narejen.", n);
        }else{
            seznam = new String[n];
        }
    }

    public static void dodajNaSeznam(String element){

    }

    public static void odstraniIzSeznama(int mesto){
    }

    public static void izpisiSeznam(){
    }

    public static void izpisiSeznam64Bit(){
    }
}