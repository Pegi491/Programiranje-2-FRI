import java.lang.reflect.Array;

public class VajeMedKorona {
    static int steviloBitov1(int x){
        int stBitov =  0;

        while(x > 0){
            if((x & 1) == 1){
                stBitov++;
            }
            x = x >>1;
        }
    return stBitov;
    }

    static void pretvori(int len){
        char tabela[] = new char[len];
        for(int i = 0; i < len; i++){
            tabela[i] = 'a';
        }
        System.out.println(tabela);
    }

public static void main(String[] args){
        steviloBitov1(43);
        String ime = "aaaaaa";
        char[] tabela = ime.toCharArray();
        int x = 0;
        for(int i = 1;i < tabela.length; i++){

        }
        System.out.println(ime.charAt(1));


    }
}
