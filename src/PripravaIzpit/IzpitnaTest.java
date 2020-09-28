package src.PripravaIzpit;

import java.util.ArrayList;

class Ekipa {
    String ime;
    public int st_prejetih_golov;
    public int st_daniah_golov;
    public int st_tekem;
    public int stevilo_tock;

    public Ekipa(String ime){
        this.ime = ime;
    }

    public void odigrano(int dani, int prejeti){
        st_daniah_golov += dani;
        st_prejetih_golov += prejeti;
        if(dani > prejeti){
            stevilo_tock += 3;
        }else if (dani == prejeti){
            stevilo_tock += 1;
        }else {
            stevilo_tock += 0;
        }
    }

    void to_String(){
        System.out.printf("Ime: %s, St.tekem: %d, Goli: %d : %d, Tocke: %d \n", ime, st_tekem,st_daniah_golov, st_prejetih_golov, stevilo_tock);
    }
}

class Skupina {
    private String ime_skupine;
    int st_ekip;
    ArrayList<Ekipa> group = new ArrayList<>();


    public Skupina(String ime_skupine){
        this.ime_skupine = ime_skupine;
    }

    void DodajEkipo(Ekipa name){
        if(st_ekip < 4){
            this.group.add(name);
            st_ekip++;
        } else {
            System.out.println("Ekipa ni bila dodana ker je skupina ze polna");
        }

    }
    void DodajTekmo(String ekipa1,int stGolov1, String ekipa2, int stGolov2) {
            for (Ekipa e : group) {
                if (e.ime.equals(ekipa1)) {
                    e.odigrano(stGolov1, stGolov2);
                }
            }

            for(Ekipa e : group) {
                if (e.ime.equals(ekipa2)) {
                    e.odigrano(stGolov2, stGolov1);
                }
            }
    }

    void to_String(){
        for(Ekipa ele : group ){
            ele.to_String();
        }
    }
}


public class IzpitnaTest {
    public static void main(String[] args) {
        Skupina A = new Skupina("A");
        A.DodajEkipo(new Ekipa("Koper"));
        A.DodajEkipo(new Ekipa("Izola"));
        A.DodajEkipo(new Ekipa("Piran"));
        A.DodajEkipo(new Ekipa("Marezige"));
        A.DodajEkipo(new Ekipa("Malija"));
        A.to_String();
        System.out.println("-----------------------------------------------");
        A.DodajTekmo("Koper",3,"Piran",2);
        A.DodajTekmo("Marezige", 0, "Izola", 2);
        A.to_String();
    }
}

