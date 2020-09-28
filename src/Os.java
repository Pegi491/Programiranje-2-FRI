import java.io.File;
import java.util.Scanner;

public class Os {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(new File("viri/zivalce.txt"));

        while(sc.hasNextLine()){
            String next = sc.nextLine();
            System.out.println(next);
        }

    }
}
