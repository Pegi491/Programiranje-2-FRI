

import java.util.Iterator;
import java.util.TreeSet;

public class DN10 {
    static TreeSet<String> getVsiPodnizi(String niz){
        TreeSet<String> set = new TreeSet<String>();
        for(int i = 0; i < niz.length(); i++) {
            for (int j = 0 + i; j <= niz.length(); j++) {
                set.add(niz.substring(i, j));
            }
        }
        return set;
    }
    static String najdaljsi(TreeSet<String> x){
        String longest = "";
        Iterator<String> i=x.iterator();
        while(i.hasNext()){
            String y = i.next();
            if(y.length() > longest.length()){
                longest = y;
            }
        }
        return longest;
    }
    public static void main(String[] args){
        int c = 1;
        TreeSet<String> set = getVsiPodnizi(args[0]);
        while(c < args.length){
            TreeSet<String> nizi = getVsiPodnizi(args[c]);
            set.retainAll(nizi);
            c++;
        }
        String zakljucni = najdaljsi(set);
        System.out.println(zakljucni);
    }
}
