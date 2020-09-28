
class Lokacija {
    private int vrstica = 0;
    private String stolpec = "";
    private char[][] krizanka;
    private String[] resitve;

    public Lokacija(char [][] krizanka, String [] besede){
        this.krizanka = krizanka;
        this.resitve = besede;
    }


    void to_string(){
        for(int v = 0; v < this.krizanka.length; v++){
            for(int s = 0; s < this.krizanka[0].length; s++){
                System.out.println(this.krizanka[v][s]);
            }
        }
    }

    void poisciNajdaljso(char [][] krizanka, String [] besede){
        boolean obstaja = false;
        for(int i = 0; i <= besede.length; i++){
            char[] vArray = besede[i].toCharArray();
            for(char c : vArray){
            }
        }

    }
}



