import java.io.File;
import java.util.Scanner;


public class DN05 {
    public static int[][] preberiLabirint(String ime)throws Exception {
        String razbi = ime.split("\\.")[0];
        String[] tabela = razbi.split("_");
        int sirina = Integer.parseInt(tabela[1]);
        int visina = Integer.parseInt(tabela[2]);
        int[][] vrni = new int[(2*visina)-1] [(2*sirina)-1];

        Scanner sc = new Scanner(new File(ime));
        while(sc.hasNextInt()) {
            for(int v = 0; v < vrni.length; v++){
                for(int s = 0; s < vrni[0].length; s++){
                    vrni[v][s] = sc.nextInt();
                }
            }
        }
        sc.close();
        return vrni;
    }

    static void zid(int x){
        for(int i = 0; i < (x+2); i++){
            System.out.print("#"+" ");
        }
    }


    public static void izrisiLabirint(int[][] labirint)throws Exception {
        int sirina = labirint[0].length;
        zid(sirina);
        System.out.println();
        for(int v = 0; v < labirint.length; v++) {
            System.out.print("#"+" ");
            for (int s = 0; s < labirint[0].length; s++) {
                if (labirint[v][s] == 0) {
                    System.out.print("#" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.print("#");
            System.out.println();
        }
        zid(sirina-2);
        System.out.print("  "+"#");
    }


    public static int[] preberiResitev(String ime)throws Exception{
        Scanner sc = new Scanner(new File(ime));
        int stevec = 0;
        while(sc.hasNextInt()){
            sc.nextInt();
            stevec++;
        }
        sc.close();
        int [] neki = new int[stevec];
        int counter = 0;
        sc = new Scanner(new File(ime));
        while(sc.hasNextInt()){
            neki[counter] = sc.nextInt();
            counter++;
        }
        sc.close();
        return neki;
    }



    public static boolean preveriResitev(int[][] labirint, int[] resitev){
    int cnt = 0;
    int x = 0;
    int gd= 0;
    int ld = 0;
    while(cnt < resitev.length){
        x = resitev[cnt];
        if(x == 3){
            ld = ld - 1;
        }
        else if(x == 4){
            ld = ld + 1;
        }
        else if(x == 5){
            gd = gd - 1;
        }
        else if(x == 6){
            gd = gd + 1;
        }
        if(labirint[gd][ld] == 0){
            return false;
        }
        cnt++;
    }
        return true;
    }



    public static void main(String[] args)throws Exception {
        int n = args.length;
        if(n == 2){
            int[][] labirint = preberiLabirint(args[0]);
            izrisiLabirint(labirint);
            int[] resitev = preberiResitev(args[1]);
            System.out.println();
            if(preveriResitev(labirint, resitev)){
                System.out.println("Pravilna resitev!");
            }
            else{
                System.out.println("Nepravilna resitev!");
            }
        }
    }
}
