package src.kvizi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class kvizi {

    static boolean jePrastevilo(int i) {
        if (i <= 1) {
            return false;
        }
        for (int x = 2; x < i; x++) {
            if (i % x == 0) {
                return false;
            }
        }
        return true;
    }

    static int vsotaPrvih(int n) {
        int rez = 0;
        int c = 0;
        int pra = 0;
        while (pra < n) {
            if (jePrastevilo(c)) {
                rez += c;
                pra++;
            }
            c++;
        }
        return rez;
    }

    static int modulo(int deljenec, int delitelj) {
        int a = deljenec;
        int b = delitelj;
        if (b <= 0) {
            return -1;
        }

        int x = 0;
        while (a >= b) {
            x = a / b;
            a = a - (b * x);
        }
        return a;
    }


    static int[] unija(int[] tabela1, int[] tabela2) {
        int x = tabela1.length + tabela2.length;
        int[] un = new int[x];
        int c = 0;
        for (int i = 0; i < tabela1.length; i++) {
            un[c] = tabela1[i];
            c++;
        }
        for (int i = 0; i < tabela2.length; i++) {
            un[c] = tabela2[i];
            c++;
        }

        return un;
    }

    static int max(String a, String b) {
        if (a.length() > b.length()) {
            return a.length();
        } else if (a.length() < b.length()) {
            return b.length();
        } else {
            return b.length();
        }
    }

    static String prepleti(String niz1, String niz2) {
        String preplet = "";
        int c = 0;
        int st = max(niz1, niz2);
        String a = "";
        String b = "";
        while (c < st) {
            if (c >= niz1.length()) {
                preplet = preplet + " ";
            } else {
                preplet = preplet + niz1.charAt(c);
            }
            if (c >= niz2.length()) {
                preplet = preplet + " ";
            } else {
                preplet = preplet + niz2.charAt(c);
            }
            c++;
        }
        return preplet;


    }

    static void odpleti(String niz1) {
        int c = 0;
        String a = "";
        String b = "";
        while (c < niz1.length()) {
            a = a + niz1.charAt(c);
            c++;
            if (c >= niz1.length()) {
                break;
            }
            b = b + niz1.charAt(c);
            c++;
        }
        System.out.println(a);
        System.out.println(b);
    }

    static String vMorse(String niz) {
        String vrni = "";
        char[] crke = niz.toUpperCase().toCharArray();
        for (int i = 0; i < niz.length(); i++) {
            switch (crke[i]) {
                case 'A':
                    vrni += ".- ";
                    break;
                case 'B':
                    vrni += "-...¸ ";
                    break;
                case 'C':
                    vrni += "-.-. ";
                    break;
                case 'D':
                    vrni += "-.. ";
                    break;
                case 'E':
                    vrni += ". ";
                    break;
                case 'F':
                    vrni += "..-. ";
                    break;
                case 'G':
                    vrni += "--. ";
                    break;
                case 'H':
                    vrni += ".... ";
                    break;
                case 'I':
                    vrni += ".. ";
                    break;
                case 'J':
                    vrni += ".--- ";
                    break;
                case 'K':
                    vrni += "-.- ";
                    break;
                case 'L':
                    vrni += ".-.. ";
                    break;
                case 'M':
                    vrni += "-- ";
                    break;
                case 'N':
                    vrni += "-. ";
                    break;
                case 'O':
                    vrni += "--- ";
                    break;
                case 'P':
                    vrni += ".--. ";
                    break;
                case 'Q':
                    vrni += "--.- ";
                    break;
                case 'R':
                    vrni += ".-. ";
                    break;
                case 'S':
                    vrni += "... ";
                    break;
                case 'Š':
                    vrni += "---- ";
                    break;
                case 'T':
                    vrni += "- ";
                    break;
                case 'U':
                    vrni += "..- ";
                    break;
                case 'V':
                    vrni += "...- ";
                    break;
                case 'W':
                    vrni += ".-- ";
                    break;
                case 'Y':
                    vrni += "-.-- ";
                    break;
                case 'Z':
                    vrni += "--.. ";
                    break;
                case ' ':
                    vrni += " ";
                    break;
                case '.':
                    vrni += ".-.-.- ";
                    break;
                case '-':
                    vrni += "-....- ";
                    break;
                case '?':
                    vrni += "..--.. ";
                    break;
                case ',':
                    vrni += "--..-- ";
                    break;
                case '"':
                    vrni += ".--..--. ";
                    break;
                case ':':
                    vrni += "---... ";
                    break;
                case '(':
                    vrni += "-.--.- ";
                    break;
                case '@':
                    vrni += ".--.-. ";
                    break;
                case '1':
                    vrni += ".---- ";
                    break;
                case '2':
                    vrni += "..--- ";
                    break;
                case '3':
                    vrni += "...-- ";
                    break;
                case '4':
                    vrni += "....- ";
                    break;
                case '5':
                    vrni += "..... ";
                    break;
                case '6':
                    vrni += "-.... ";
                    break;
                case '7':
                    vrni += "--... ";
                    break;
                case '8':
                    vrni += "---.. ";
                    break;
                case '9':
                    vrni += "----. ";
                    break;
                case '0':
                    vrni += "----- ";
                    break;
            }
        }
        return vrni.trim();
    }

    static int[] intToArray(int x) {
        String temp = Integer.toString(x);
        int[] arr = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            arr[i] = temp.charAt(i) - '0';
        }
        return arr;
    }

    static int vsotaSkupnihCifer(int a, int b) {
        java.util.HashSet<Integer> cifre = new java.util.HashSet<>();
        int[] aa = intToArray(a);
        int[] bb = intToArray(b);
        int vsota = 0;
        for (int i = 0; i < aa.length; i++) {
            for (int z = 0; z < bb.length; z++) {
                if (aa[i] == bb[z]) {
                    cifre.add(aa[i]);
                }
            }
        }

        for (int element : cifre) {
            vsota = vsota + element;
        }
        return vsota;
    }

    static int[] sestejPolinoma(int[] a, int[] b){
        int velikost = Math.max(a.length, b.length);
        int[] vrni = new int[velikost];

        for(int i = 0; i < velikost; i++){
            vrni[i] += a[i];
        }

        for(int i = 0; i < velikost; i++){
            vrni[i] += b[i];
        }
        return vrni;
    }

    public static void main(String[] args) {


        int[] p1 = {1,2,3,4,5,6};
        int[] p2 = {1,2,3};
        int[] p1p2 = sestejPolinoma(p1, p2);
        System.out.println(java.util.Arrays.toString(p1p2));
    }
}

