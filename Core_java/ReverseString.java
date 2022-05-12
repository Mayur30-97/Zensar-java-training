package Core_java;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String s="aaryan";

      
        String srev="";

        for(int i=s.length()-1;i>=0;i-=2)
        {
            srev+=s.charAt(i);
        }
        System.out.println(srev);

        
        

      

        
       
        

      

    
    
    }
}
