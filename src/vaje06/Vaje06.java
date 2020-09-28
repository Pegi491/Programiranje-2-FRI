package src.vaje06;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.util.Random;

public class Vaje06 {
    public static void main(String[] args) {
        Igra.igraj();
    }
}

class Igra {
    private static Random random = new Random();

    /* Mreza */
    private static final int STRANICA_KVADRATA = 10;
    private static final int DEBELINA_ROBA = 2;

    /* IGRALNA POVRŠINA */
    private static final int VELIKOST = 4 * STRANICA_KVADRATA + 5 * DEBELINA_ROBA;
    private static final int HEADER = 10;

    /* BARVE */
    private static Color BARVA_0 = Color.decode("#c1b2ab");
    private static Color BARVA_2 = Color.decode("#d66853");
    private static Color BARVA_4 = Color.decode("#7d4e57");
    private static Color BARVA_8 = Color.decode("#7e8d85");
    private static Color BARVA_16 = Color.decode("#9dbebb");
    private static Color BARVA_32 = Color.decode("#757083");
    private static Color BARVA_64 = Color.decode("#aec3b0");
    private static Color BARVA_128 = Color.decode("#9b7e46");
    private static Color BARVA_256 = Color.decode("#8896ab");
    private static Color BARVA_512 = Color.decode("#646e68");
    private static Color BARVA_1024 = Color.decode("#ffb30f");
    private static Color BARVA_2048 = Color.decode("#849324");

    /* PISAVE */
    private static Font FONT_1 = new Font("Arial", Font.BOLD, 60);
    private static Font FONT_2 = new Font("Arial", Font.BOLD, 40);
    private static Font FONT_3 = new Font("Arial", Font.BOLD, 20);
    private static Font FONT_SCORE = new Font("Arial", Font.BOLD, 30);


    /* KODE SMERNIH TIPK */
    private static final int ESC_BUTTON = 27;
    private static final int LEFT_BUTTON = 37;
    private static final int UP_BUTTON = 38;
    private static final int RIGHT_BUTTON = 39;
    private static final int DOWN_BUTTON = 40;

    /* CASOVNE KONSTANTE */
    private static final int PAUSE = 10;
    private static final int PAUSE_LONG = 100;

    /*PARAMETRI IGRE*/
    private static boolean soPraznaPolja = true;
    private static int[][] polja = new int[4][4];

    /* TOCKE */
    private static int tocke = 0;

    public static void igraj(){
        StdDraw.setScale(HEADER,VELIKOST);
        StdDraw.filledSquare(STRANICA_KVADRATA,STRANICA_KVADRATA,DEBELINA_ROBA);

    }
}