package src.DN09;

class Position {
    private int x, y;

    public Position(int x, int y){
        this.y = y;
        this.x = x;
    }

    void pokaziSe(){
        System.out.println(this.x + " " + " " + this.y);
    }

     void sestevanje(int x, int y){
        this.x = this.x + x;
        this.y = this.y + y;
    }

     void odstevanje(int x, int y){
         this.x = this.x - x;
         this.y = this.y - y;
     }

}

class Human {


}

public class DN09 {
    public static void main(String[] args){
        Position clovek = new Position(10, 5);
        clovek.pokaziSe();


    }
}
