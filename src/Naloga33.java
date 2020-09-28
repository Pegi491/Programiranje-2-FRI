package src;

import java.io.*;

public class Naloga33 {

    public static void preberiPodatkeWav(byte buffer[]){
        System.out.println("stevilo kanalov  je "+buffer[22]);
        System.out.println("frekvenca vzorcenja je "+buffer[24]+" "+buffer[25]+" "+buffer[26]+" "+buffer[27]);
    }

    public static void main(String[] args) throws IOException {
        File file = new File("zvok.wav");
        InputStream fis = new FileInputStream(file);
        byte[] buffer = new byte[(int)file.length()];
        fis.read(buffer, 0, buffer.length);
        fis.close();
        System.out.println(buffer[24]+" "+buffer[25]+" "+buffer[26]+" "+buffer[27]);
    }
}
