package basics;

import java.util.Scanner;

public class table {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println ("Enter a number");
        int number=sc.nextInt();

        for(int i=0;i<10;i++)
        {
            System.out.println((i+1) * number);
        }
        
    }
    
}
