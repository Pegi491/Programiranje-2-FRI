package src.PripravaIzpit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Priprava {

    static void piramida(int n){
        ArrayList<int[]> vrstica = new ArrayList<>();
        vrstica.add(new int[] { 1 });
        for (int i = 2; i < n; i++){
            int prva = i % 10;
            int [] vrsta = new int[i];
            vrsta[0] = prva;
            for (int z = 1; z < i; z++){
                vrsta[z] = (vrsta[z-1] + vrstica.get(i - 2)[z - 1]) % 10;
            }
            vrstica.add(vrsta);
        }
        for(int [] ele : vrstica) {
            for (int i = 0; i < ele.length; i++) {
                System.out.print(ele[i]+ " ");
            }
            System.out.println();
        }
    }

    static void pikice(String dat, int n, int s){
        try{
            Scanner sc = new Scanner(new File(dat));
            String pike  = ".";
            int counter = 0;
            String besedilo = "";
            while(sc.hasNext()){
                besedilo += sc.nextLine();
            }
            System.out.println(besedilo);
            char[] znaki = besedilo.toCharArray();

            while(counter < besedilo.length()){
                String line = "";
                int dolzina = 0;
                int lineSt = 0;
                while(line.length() < n && counter < besedilo.length()){
                    line += znaki[counter];
                    counter++;
                }
                System.out.println("......"+line+".....");
            }


        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


    static void razlicna(String dat){
        String razdeli = " ";
        int counter = 0;
        HashSet<Integer> stevila = new HashSet<>();
        try {
            Scanner sc = new Scanner(new File(dat));
            while(sc.hasNextInt()){
                stevila.add(sc.nextInt());
                counter++;
            }
            int razlicnih = stevila.size();
            int vsota = 0;
            for(int e : stevila){
                vsota += e;
            }
            double povp = vsota / razlicnih;

            System.out.printf("%d %d %.2f", counter, razlicnih, povp);

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        razlicna("stevilaStat.txt");
    }
}
