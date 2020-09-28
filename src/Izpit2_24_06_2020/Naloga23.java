package src.Izpit2_24_06_2020;

import java.io.*;

public class Naloga23 {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream preberi = new FileInputStream(new File("medved.bin"));
            int c = 0;
            while ((c = preberi.read()) != -1) {
                char ch = (char) c;
                System.out.println(ch);
            }
        }
            catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
