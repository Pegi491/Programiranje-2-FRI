package src;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdOut;

public class Naloga32 {
    public static void main(String[] args) {
        String bin = Integer.toBinaryString(32837969);
        //System.out.println("0b"+bin);
        String[] poVrsticah = new String[6];
        String vstavi = "";
        int c = 0;
        int i = 0;
        while(i < bin.length()){
            if(vstavi.length() % 5 == 0){
                poVrsticah[c] = vstavi;
                c++;
                vstavi = "";
            }
            char ch = bin.charAt(i);
            vstavi = vstavi + ch;
            i++;
        }
        poVrsticah[c] = vstavi;
        for(String e : poVrsticah){
            System.out.println(e);
        }
        StdDraw.setScale(0,100);

        StdDraw.setPenColor();
        StdDraw.filledRectangle(10,0,20,20);

    }

}
