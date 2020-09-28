package Tarok;

import java.io.File;
import java.util.Scanner;

import static Tarok.Tarok.izpisi;
import static Tarok.Tarok.ustvariKarte;


public class Testing {
    public static void main(String [] args)throws Exception{
        int dolzina = 30;
        for(int kot = 0; kot > -360;kot--) {
            double x = dolzina * Math.sin(2 * Math.PI * kot / 360);
            double y = dolzina * Math.cos(2 * Math.PI * kot / 360);

            System.out.println(x+"  "+y);
        }
        }
    }
