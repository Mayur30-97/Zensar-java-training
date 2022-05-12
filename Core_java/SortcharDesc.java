package Core_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortcharDesc {

    public static String sortdesc(String str)
    {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            int s=str.toLowerCase().charAt(i);
            l.add(s);
        }
        Collections.sort(l);
        Collections.reverse(l);
        String nstr="";

        for (int i : l) {
            nstr+=(char)i;
        }

        return nstr;

    }
    public static void main(String[] args) {
        System.out.println(sortdesc("Mayur"));
    }
}
