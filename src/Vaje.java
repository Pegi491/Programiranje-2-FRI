import java.text.DecimalFormat;

public class Vaje {
    static Double izracunajPiLeibniz(int n){
        double x = 1.0;
        int counter = 0;
        double vsota = 0;
        while(counter < n){
            if(counter % 2 == 0) {
                vsota = vsota + 1 / x;
            }
            else{
                vsota = vsota - 1 / x;
            }
            x = x + 2;
            counter++;
        }

        return vsota*4.0;
    }


    static void naSestLeibniz(){
        System.out.println("    n          PI                           PI(LEIBNIZ)                    RAZLIKA");
        System.out.println("-------------------------------------------------------------------------------------------");
        int row = 0;
        double izracun = 0;
        double st = 0.00000;

        while((int)(izracun*100000) != (int)(Math.PI * 100000)){
            int neki = (int)Math.pow(2, row);
            izracun = izracunajPiLeibniz(neki);
            double razlika = Math.PI - izracun;
            System.out.printf("%6d          %.15f           %.15f             %+.15f \n",neki, Math.PI, izracun, razlika);
            row++;
        }
    }


    static double vrniNLeibniz(int n){
        int counter = 0;
        double vsota = 0;
        String s = "1";
        for(int i = 0; i < n; i++){
            s = s+"0";
        }

        int krat = Integer.parseInt(s);
        while(((int)(vsota * krat)) != ((int)(Math.PI * krat))){
            vsota = izracunajPiLeibniz(counter);
            counter++;
        }
        return counter - 1;
    }

    static double izracunajPiNilakantha(int n){
        double x = 2.0;
        int counter = 0;
        double vsota = 3;
        while(counter < n){
            if(counter % 2 == 0) {
                vsota = vsota + 4d / (x * (x + 1) * (x + 2));
            }
            else{
                vsota = vsota - 4d / (x * (x + 1) * (x + 2));
            }
        counter++;
        x = x + 2;
        }
        return vsota;
    }

    static void naSestNilakantha(){
        System.out.println("    n          PI                           PI(Nilakantha)                    RAZLIKA");
        System.out.println("-------------------------------------------------------------------------------------------");
        int row = 0;
        double izracun = 0;
        double st = 0.00000;

        while((int)(izracun*100000) != (int)(Math.PI * 100000)){
            int neki = (int)Math.pow(2, row);
            izracun = izracunajPiNilakantha(neki);
            double razlika = Math.PI - izracun;
            System.out.printf("%6d          %.15f           %.15f             %+.15f \n",neki, Math.PI, izracun, razlika);
            row++;
        }
    }

    static void tabela(int n){
        System.out.println("Vrsta           n           priblizek");
        System.out.println("--------------------------------------");
        System.out.printf("Leibniz          %f              %.15f", vrniNLeibniz(n), izracunajPiLeibniz((int) vrniNLeibniz(n)));


    }

    static void izracunajPiWallis(int n){
        double sodo = 2.0d;
        double liho = 1.0d;
        int counter = 0;
        double vsota = 0;
        while(counter < n){
            vsota = vsota * ((sodo/liho) * (sodo/(liho+2)));
            liho = liho + 2;
            sodo = sodo + 2;
            counter++;
        }
        System.out.print(vsota);
    }

    public static void main(String[] args) {
        double x = izracunajPiLeibniz(10240);
        System.out.println(x);
        System.out.println(Math.PI);
        izracunajPiWallis(10240);
    }



}
