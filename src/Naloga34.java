
import java.io.FileReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Naloga34 {
    public static void main(String[] args) {
        HashMap<String, String> kratice = new HashMap<>();
        HashMap<String, String> stPrebivalcev = new HashMap<>();
        HashSet<String> vse = new HashSet<>();

        try {
            Scanner sc = new Scanner(new FileReader("drzave.txt"));

            while (sc.hasNextLine()) {
                String vrstica = sc.nextLine();
                String[] drzava = vrstica.split(";");
                kratice.put(drzava[0], drzava[1]);
                stPrebivalcev.put(drzava[0], drzava[2]);
            }

            sc.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Scanner sc = new Scanner(new FileReader("mesta.txt"));

            while (sc.hasNextLine()) {
                String vrstica = sc.nextLine();
                String[] mesto = vrstica.split(";");
                double delez = Double.parseDouble(mesto[2]) / Double.parseDouble(stPrebivalcev.get(mesto[0])) * 100;
                BigDecimal trueDelez = new BigDecimal(delez).setScale(2, RoundingMode.HALF_UP);
                vse.add(String.format("%s;%s;%s\n", kratice.get(mesto[0]), mesto[1], trueDelez));
            }

            sc.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        for( String e : vse){
            System.out.println(e);

        }
    }
}
