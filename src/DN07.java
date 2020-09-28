package src;
import edu.princeton.cs.introcs.StdDraw;
import java.awt.*;

public class DN07 {

    static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    static void narisiStolpce(int [] x){
        StdDraw.setScale(0,1);
        StdDraw.setPenRadius(0.01);
        StdDraw.rectangle(0.5,0.5,0.5,0.5);
        double rez =  (( 100 / x.length) * 0.1 )* 0.1;
        double visina = 0;
        double sirina = rez / 2 - 0.01;
        double sirinax = rez / 2 + 0.01;

        int max = getMax(x);

        for(int cnt = 0; cnt < x.length; cnt++) {
            visina = (((x[cnt] * 95) / max) * 0.1) * 0.1;
            if (cnt % 3 == 0) {
                StdDraw.setPenColor(Color.red);
            } else if (cnt % 3 == 1) {
                StdDraw.setPenColor(Color.green);
            } else {
                StdDraw.setPenColor(Color.BLUE);
            }

            StdDraw.filledRectangle(sirinax, 0, sirina, visina);

            sirinax = sirinax + rez;
        }

    }
    public static void main(String[] args){
        String stolpci = args[0];
        String [] y = stolpci.split(",");
        int [] x = new int [y.length];
        for(int i = 0; i < y.length; i++) {
            x[i] = Integer.parseInt(y[i]);
        }
        narisiStolpce(x);
    }
}
