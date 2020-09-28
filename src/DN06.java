import java.awt.*;
import java.util.Random;

public class DN06 {
        static void korona(double s, double v, double velikost){
            StdDraw.setScale(-200,200);
            String[] colors = {"#990000","#B30000","#cc0000","#E60000","#FF0000","#922a31"};
            int lines = 0;
            int palcke = (int)(Math.random()*13)+10;
            while(lines < palcke){
                StdDraw.setPenColor(Color.decode(colors[lines % 4]));
                StdDraw.setPenRadius(0.01);
                int kot =  (int)(Math.random()*360)-360;
                int dolzina = (int)velikost + 20;
                int z = (int)(Math.random()*3)-1;
                double xOs = dolzina * Math.sin(2 * Math.PI * kot / 360) + z;
                double yOs = dolzina * Math.cos(2 * Math.PI * kot / 360) + z;
                StdDraw.line((int)s, (int)v, xOs + s, yOs + v);
                StdDraw.line((int)s, (int)v, -xOs + s, -yOs + v);
                StdDraw.setPenColor(Color.decode(colors[lines % 4 +1]));
                StdDraw.setPenRadius(0.03);
                StdDraw.point(xOs + s ,yOs + v);
                StdDraw.point(-xOs + s,-yOs + v);
                kot--;
                lines++;
        }
            StdDraw.setPenRadius(0.02);
            StdDraw.setPenRadius(0.007);
            StdDraw.setPenColor(Color.decode("#990000"));
            int cnt = 4;
            for(int i = 0; i < (int)velikost; i++) {
                StdDraw.setPenColor(Color.decode(colors[i % 4]));
                StdDraw.circle((int)s, (int)v, 0 + i);
            }
            //StdDraw.setPenColor(Color.);


        }


    public static void main(String[] args){
            int cnt = 0;
            while(cnt < 8) {
                double s = new Random().nextInt(300 + 1) -200;
                double v = new Random().nextInt(300 + 1) -200;
                double velikost = new Random().nextInt(40 + 1) + 10;
                korona(s, v, velikost);
                cnt++;
            }



    }
}