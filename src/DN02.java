public class DN02 {
    static void zvezdice(String[] x) {
        String s = "*";
        System.out.print("  **");
        for (int i = 0; i < x.length; i++) {
            for (int z = 0; z < x[i].length(); z++) {
                System.out.printf("%s", s);
            }
            if (i == x.length-1) {
                System.out.print("**");
            } else {
                System.out.print("**  **");
            }
        }
    }
    static void izpis(String[] x){
        zvezdice(x);
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            System.out.printf("  * %s *", x[i]);
        }
        System.out.println();
        zvezdice(x);
    }

    public static void main (String[] args){
        izpis(args);
    }
}
