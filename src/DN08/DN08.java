import java.io.File;
import java.text.Format;
import java.util.Scanner;

class Stevilo {
    double absolutnaVrednost(){
        return 0;
    }

    public String toString(){
        return "";
    }

    static class CeloStevilo extends Stevilo{
        private int n;
        private double rez;

        CeloStevilo(String n){
            this.n = Integer.parseInt(n) ;
        }
        @Override
         double absolutnaVrednost(){
            if(n < 0){
                rez = n * -1;
            } else
                rez = n;
            return rez;
        }
        @Override
          public String toString(){
            String s = Integer.toString(n);
            return s;
        }

    }

    static class RacionalnoStevilo extends Stevilo{
        private int p;
        private int q;
        private double abs;

        RacionalnoStevilo(String p, String q){
            this.p = Integer.parseInt(p) ;
            this.q = Integer.parseInt(q) ;
        }

        @Override
         double absolutnaVrednost(){
            if(p < 0  && q < 0){
                abs = p / (double) q;
            }else if ((p < 0 && q > 0 ) || (p > 0 && q < 0 )){
                abs = p / (double) q;
                abs = abs * -1;
            }else{
                abs = p / (double) q;
            }
            return abs;
        }

        @Override
        public String toString() {

            String s =  p + " / " + q ;
            return s;
        }
    }

    static class KompleksnoStevilo extends Stevilo{
        private int re;
        private int im;
        private double abs;

        KompleksnoStevilo(String re, String im){
            this.re = Integer.parseInt(re);
            this.im = Integer.parseInt(im);

        }

        @Override
        double absolutnaVrednost() {
            abs = Math.sqrt(Math.pow(re, 2) + Math.pow(im, 2));
            return abs;
        }
        @Override
         public String toString(){
            if(im < 0){
                String s = re + " - " + im * -1 + " i";
                return s;
            } else {
                String s = re + " + " + im + " i";
                return s;
            }
        }

    }
}

/**
 * @author Leonard Pegan
 **/
public class DN08 {
    static final int MAX_STEVIL = 100;

    static Stevilo [] preberiStevila(String imeDatoteke) throws Exception {
        Stevilo [] stevila = new Stevilo[MAX_STEVIL];

        // TODO: ... odpri datoteko in preberi števila
        String [] crke = new String[MAX_STEVIL];
        int i = 0;

        Scanner sc = new Scanner(new File(imeDatoteke));
        while(sc.hasNextLine()) {
            String[] middle =  sc.nextLine().split(" ");
            switch(middle[0]){
                case "Z":
                    Stevilo.CeloStevilo n = new Stevilo.CeloStevilo(middle[1]);
                    stevila[i] = n;
                    i++;
                    break;

                case "Q":
                    Stevilo.RacionalnoStevilo p = new Stevilo.RacionalnoStevilo(middle[1], middle[2]);
                    stevila[i] = (p);
                    i++;
                    break;

                case "C":
                    Stevilo.KompleksnoStevilo re = new Stevilo.KompleksnoStevilo(middle[1], middle[2]);
                    stevila[i] = (re);
                    i++;
                    break;


            }
        }

        return stevila;
    }

    public static void main(String[] args) throws Exception {
        Stevilo [] stevila = preberiStevila(args[0]);

        for (int i = 0; i < MAX_STEVIL; i++) {
            // izpišem samo "neprazna" števila v tabeli
            if (stevila[i] == null) continue;


            System.out.printf("Absolutna vrednost stevila %s je %.2f\n",
                    stevila[i].toString(), stevila[i].absolutnaVrednost());
        }
    }
}

