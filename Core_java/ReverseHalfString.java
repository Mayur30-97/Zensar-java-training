package Core_java;

import java.util.Scanner;

public class ReverseHalfString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String srev="";
        for(int i=s.length()-1;i>=s.length()/2;i-=2)
        {
            srev+=s.charAt(i);
        }

        System.out.println(srev);

        sc.close();

    }
}
