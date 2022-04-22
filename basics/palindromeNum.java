package basics;

import java.util.Scanner;

public class palindromeNum {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int originaln=n;
        int reverse=0;
        while(n!=0)
        {
            int temp =n%10;
            reverse =reverse *10 + temp;
            n=n/10;
        }

        if(originaln==reverse)
        {
            System.out.println("palindrome");
        }

        else
        {
            System.out.println("Not palindrome");
        }

        
    }
    
}
