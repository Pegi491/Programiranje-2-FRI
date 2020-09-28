public class DN03 {
    static void alg(String[] x) {
        if(x.length == 2){
        int m = Integer.parseInt(x[1]);
        int n = Integer.parseInt(x[0]);
        int i = 0;
        int max = 0;
        for (int g = n; g <= m; g++) {
            int counter = 1;
            i = g;
            while (i != 1) {
                if (i % 2 == 0) {
                    i = i / 2;
                    counter++;
                } else {
                    i = (i * 3) + 1;
                    counter++;
                }
            }
            if (counter > max) {
                max = counter;
            }
        }
        System.out.printf("Najdaljse Collatzovo zaporedje pri %s <= i <= %s ima %s clenov.", n, m, max);
    }else{
            System.out.print("Uporaba: java DN03 n m");
        }
    }
            public static void main (String[]args){
            alg(args);
        }
    }

